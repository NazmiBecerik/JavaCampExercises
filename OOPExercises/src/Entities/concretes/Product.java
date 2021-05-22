package Entities.concretes;

import Entities.abstracts.Entity;

public class Product implements Entity
{
	private int id ;
	private String name;
	private int categoryId;
	private double price;
	private String description;
	private double unitsInStock;
	public Product(int id, String name, int categoryId, double price, String description, double unitsInStock) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.price = price;
		this.description = description;
		this.unitsInStock = unitsInStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(double unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
}
