package hello.itemservice.repository;

import hello.itemservice.domain.item.Item;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemRepository {

    private Map<Long, Item> store = new HashMap<>();
    private long sequence = 0L;

    private static final ItemRepository instance = new ItemRepository();

    public static ItemRepository getInstance() {
        return instance;
    }

    public Map<Long, Item> findAll() {
        return store;
    }
}
