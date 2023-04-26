package ru.practicum.item;

import java.util.List;

public interface ItemService {
    Item addNewItem(Long userId, Item item);
    List<Item> getItems(Long userId);
    void deleteItem(Long userId, Long itemId);
}
