package ru.practicum.item;

import java.util.List;

public class ItemRepositoryImpl implements ItemRepository {
    @Override
    public List<Item> findByUserId(long userId) {
        return null;
    }

    @Override
    public Item save(Item item) {
        return null;
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {

    }
}
