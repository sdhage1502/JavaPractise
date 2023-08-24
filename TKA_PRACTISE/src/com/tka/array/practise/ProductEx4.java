package com.tka.array.practise;

public class ProductEx4 {

	int id;
	String name;
    float price;
    String description;
	@Override
	public String toString() {
		return "ProductEx4 [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	public ProductEx4(int id, String name, float price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
}
