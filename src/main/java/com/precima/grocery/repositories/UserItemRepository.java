package com.precima.grocery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.precima.grocery.model.GroceryItem;
import com.precima.grocery.model.UserItem;

@Repository
public interface UserItemRepository extends JpaRepository<UserItem, Long>{

	UserItem findByGroceryItem(GroceryItem groceryItem);
	
}
