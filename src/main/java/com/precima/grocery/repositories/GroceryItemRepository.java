package com.precima.grocery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.precima.grocery.model.GroceryItem;

@Repository
public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long>{	
	
}
