package com.raven.restaurant.model;

public class Menu_Item {
	int item_Id;
	String item_Name;
	String item_Description;
	int item_Price;
	public Menu_Item(int item_Id, String item_Name, String item_Description, int item_Price) {
		super();
		this.item_Id = item_Id;
		this.item_Name = item_Name;
		this.item_Description = item_Description;
		this.item_Price = item_Price;
	}
	public Menu_Item() {
		super();
	}
	public int getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(int item_Id) {
		this.item_Id = item_Id;
	}
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
	public String getItem_Description() {
		return item_Description;
	}
	public void setItem_Description(String item_Description) {
		this.item_Description = item_Description;
	}
	public int getItem_Price() {
		return item_Price;
	}
	public void setItem_Price(int item_Price) {
		this.item_Price = item_Price;
	}
	@Override
	public String toString() {
		return "Menu_item [item_Id=" + item_Id + ", item_Name=" + item_Name + ", item_Description=" + item_Description
				+ ", item_Price=" + item_Price + "]";
	}
	
	
	

}