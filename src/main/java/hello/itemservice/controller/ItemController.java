package hello.itemservice.controller;

import hello.itemservice.domain.item.Item;
import hello.itemservice.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class ItemController {

    ItemRepository itemRepository = ItemRepository.getInstance();

    @GetMapping
    public String itemList(Model model) {

        List<Item> items = itemRepository.findAll();

        model.addAttribute("items", items);

        return "/list";
    }

    @GetMapping("/register")
    public String registerForm() {

        return "/register";
    }

    @PostMapping("/register")
    public String registerItem(@ModelAttribute Item item) {

        itemRepository.save(item);

        return "redirect:/";
    }

    @GetMapping("/read/{itemId}")
    public String readItem(@PathVariable Long itemId, Model model) {

        Item item = itemRepository.findOne(itemId);

        model.addAttribute("item", item);

        return "/read";
    }

    @GetMapping("/modify/{itemId}")
    public String modifyForm(@PathVariable Long itemId, Model model) {

        Item item = itemRepository.findOne(itemId);

        model.addAttribute("item", item);

        return "/modify";
    }

    @PostMapping ("/modify")
    public String modify(@ModelAttribute Item item) {

        itemRepository.modify(item);

        return "/read";
    }

    @GetMapping("/delete/{itemId}")
    public String delete(@PathVariable Long itemId) {

        itemRepository.delete(itemId);

        return "redirect:/";
    }
}
