package com.foodbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodbox.model.Item;
import com.foodbox.service.ItemService;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ItemController {
    
	@Autowired
	private ItemService itemservice;
	
	@PostMapping("/item")
	public Item createItem(@RequestBody Item item) {
		
		return itemservice.createItem(item);
	}

    @GetMapping("/items")
	public List<Item> getAllItems() {
		
		return itemservice.getAllItems();
	}
    
    @DeleteMapping(value = "/item/{itemId}")
    public void deleteByItemId(@PathVariable int itemId) {
    	itemservice.deleteByItemId(itemId);
    }
    
    @GetMapping(value = "/item/{itemId}")
    public Item findByItemId(@PathVariable int itemId) {
    	
    	return itemservice.findByItemId(itemId);
    }
    
    @PutMapping("/item")
    public Item updateItem(@RequestBody Item item) {
    	
    	return itemservice.updateItem(item);
    }
    
    @GetMapping(value = "/items/{itemCuisine}")
    public List<Item> findByItemCuisine(@PathVariable String itemCuisine) {
    	
    	return itemservice.findByItemCuisine(itemCuisine);
    }

}
