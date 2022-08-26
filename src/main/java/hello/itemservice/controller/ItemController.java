package hello.itemservice.controller;

import hello.itemservice.domain.item.Item;
import hello.itemservice.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
@Slf4j
public class ItemController {

    ItemRepository itemRepository = ItemRepository.getInstance();

    @GetMapping("/")
    public String itemList(Model model) {

        Map<Long, Item> items = itemRepository.findAll();

        model.addAttribute("items", items);

        return "list";
    }
}
