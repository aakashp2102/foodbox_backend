package com.foodbox.service;

import java.util.List;

import com.foodbox.model.Item;

public interface ItemService {

	public Item createItem(Item item);
	public List<Item> getAllItems();
	public void deleteByItemId(int itemId);
	public Item findByItemId(int itemId);
	public Item updateItem(Item item);
	public List<Item> findByItemCuisine(String itemCuisine);
}