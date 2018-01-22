package com.precima.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.precima.grocery.model.GroceryItem;
import com.precima.grocery.repositories.GroceryItemRepository;

@RestController
@RequestMapping("/api/grocery-items")
public class GroceryItemController {
	
	@Autowired
	private GroceryItemRepository groceryItemRepository;
  
	@RequestMapping(method = RequestMethod.GET)
	public List<GroceryItem> findItems() {
		return groceryItemRepository.findAll();
	}

}
