package com.precima.grocery.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="USER_ITEM")
public class UserItem implements Serializable{
	
	public UserItem() { }
	
	public UserItem(GroceryItem groceryItem, Integer quantity, Boolean bought) {
		super();
		this.groceryItem = groceryItem;
		this.quantity = quantity;
		this.bought = bought;
	}
	
	public UserItem(Long id, GroceryItem groceryItem, Integer quantity, Boolean bought) {
		super();
		this.id = id;
		this.groceryItem = groceryItem;
		this.quantity = quantity;
		this.bought = bought;
	}
	
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_GROCERY_ITEM")
    private GroceryItem groceryItem;
    
    @Column(name="QUANTITY", nullable=false)
    private Integer quantity;

    @Column(name="BOUGHT", nullable=false)
    private Boolean bought;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GroceryItem getGroceryItem() {
		return groceryItem;
	}

	public void setGroceryItem(GroceryItem groceryItem) {
		this.groceryItem = groceryItem;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getBought() {
		return bought;
	}
	
	public void setBought(Boolean bought) {
		this.bought = bought;
	}
	
	@Override
	public String toString() {
		return "UserItem [id=" + id + ", groceryItem=" + groceryItem + ", quantity=" + quantity + ", bought="
				+ bought + "]";
	}
}
