package com.foodbox.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.foodbox.model.Item;
import com.foodbox.repository.ItemRepository;
import com.foodbox.service.ItemService;


@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemRepository itemrepository;

	@Override
	public Item createItem(Item item) {

		return itemrepository.save(item);
	}

	@Override
	public List<Item> getAllItems() {

		return itemrepository.findAll();
	}

	@Override
	public void deleteByItemId(int itemId) {
		
		 itemrepository.deleteByItemId(itemId);
		
	}

	@Override
	public Item findByItemId(int itemId) {
		
		return itemrepository.findByItemId(itemId);
	}
	
	
	@Override
	public Item updateItem(Item item) {
		
		return itemrepository.save(item);
	}

	@Override
	public List<Item> findByItemCuisine(String itemCuisine) {
		
		return itemrepository.findByItemCuisine(itemCuisine);
	}

}

