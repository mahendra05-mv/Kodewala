package com.kodewala.mobile;

public class Mobile {

	private String company;
	private String model;
	private int battery;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public void call()
	{
		System.out.println(company + "'s " + model + " got battery  capacity of " +battery + " mAh");
	}
}
