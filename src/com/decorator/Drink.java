package com.decorator;

public abstract class Drink {

	public String desc="";
	private float price = 0f;
	
	public String getDesc() {
		return desc+"-"+this.price;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public abstract float cost();
}
