package com.study.strem�ַ���File��;

public class Product {
	private int id;
	private String name;
	private String category;
	private double price;
	private int stock;
	private String describtion;
	private int state;
	
	public Product() {
		
	}

	public Product(int id, String name, String category, double price, int stock, String describtion, int state) {
		
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.describtion = describtion;
		this.state = state;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state; // 1���� 0ɾ��
	}

	@Override
	public String toString() {
		return id + "," + name + "," + category + "," + price + ","
				+ stock + "," + describtion + "," + state ;
	}
	
	

}
