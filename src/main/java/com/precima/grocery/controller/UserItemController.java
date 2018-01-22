package com.precima.grocery.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.precima.grocery.model.GroceryItem;
import com.precima.grocery.model.UserItem;
import com.precima.grocery.repositories.GroceryItemRepository;
import com.precima.grocery.repositories.UserItemRepository;

@RestController
@RequestMapping("/api/user-items")
public class UserItemController {
	
	@Autowired
	private UserItemRepository userItemRepository;
	
	@Autowired
	private GroceryItemRepository groceryItemRepository;
  
	@GetMapping
	public List<UserItem> findItems() {
		return userItemRepository.findAll();
	}
	
	@PostMapping
	public void addItem(@Valid @RequestBody Long id) {
		GroceryItem groceryItem = groceryItemRepository.findOne(id);
		
		if(groceryItem != null) {
			UserItem userItem = userItemRepository.findByGroceryItem(groceryItem);
			if(userItem == null) {
				userItem = new UserItem(groceryItem, 1, false);
				userItemRepository.save(userItem);
			} else {
				userItem.setQuantity(userItem.getQuantity()+1);
				userItem.setBought(false);
			}
			userItemRepository.save(userItem);
		} else {
//			@TODO EXCEPTION 
		}
	}
	
	@PutMapping
	public void updateItem(@Valid @RequestBody UserItem userItem) {
		userItemRepository.save(userItem);
	}
	
	@DeleteMapping(value="/{id}")
    public void deleteItem(@PathVariable("id") Long id) {
		userItemRepository.delete(id);
    }
}
