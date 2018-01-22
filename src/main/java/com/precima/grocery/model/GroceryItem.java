package com.precima.grocery.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
 
@SuppressWarnings("serial")
@Entity
@Table(name="GROCERY_ITEM")
public class GroceryItem implements Serializable{
	
	public GroceryItem() { }
	
    public GroceryItem(Long id, String title, String notes, double value) {
		super();
		this.id = id;
		this.title = title;
		this.notes = notes;
		this.value = value;
	}

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
 
    @NotEmpty
    @Column(name="TITLE", nullable=false)
    private String title;
 
    @Column(name="notes", nullable=false)
    private String notes;
 
    @Column(name="VALUE", nullable=false)
    private double value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "GroceryItem [id=" + id + ", title=" + title + ", notes=" + notes + ", value=" + value + "]";
	}
	
	
}