package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {

    private Long id;
    private String name;
    private Integer price;
    private Integer quantity;

    public Item(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}