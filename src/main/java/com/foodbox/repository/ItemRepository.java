package com.foodbox.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.foodbox.model.Item;


@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
	public void deleteByItemId(int itemId); 
	public Item findByItemId(int itemId);
	public List<Item> findByItemCuisine(String itemCuisine);
}