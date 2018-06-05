package com.raven.restaurant.model;

public class Restaurant {

	int rest_Id;
	String Name;
	String Location;
	int phone;
	String emailId;
	int hoursId;
	
	public Restaurant(int rest_Id, String name, String location, int phone, String emailId, int hoursId) {
		super();
		this.rest_Id = rest_Id;
		this.Name = name;
		this.Location = location;
		this.phone = phone;
		this.emailId = emailId;
		this.hoursId = hoursId;
	}

	public Restaurant() {
		super();
	}

	public int getRest_Id() {
		return rest_Id;
	}

	public void setRest_Id(int rest_Id) {
		this.rest_Id = rest_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getHoursId() {
		return hoursId;
	}

	public void setHoursId(int hoursId) {
		this.hoursId = hoursId;
	}

	@Override
	public String toString() {
		return "Restaurant [rest_Id=" + rest_Id + ", Name=" + Name + ", Location=" + Location + ", phone=" + phone
				+ ", emailId=" + emailId + ", hoursId=" + hoursId + "]";
	}
	
	
	
}
