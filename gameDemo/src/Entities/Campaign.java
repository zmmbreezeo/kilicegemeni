package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String name;
	private String description;
	private double discount;
	public Campaign() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Campaign(int id, String name, String description, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.discount = discount;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
