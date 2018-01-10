package com.decorator.decorator;

import com.decorator.Drink;

public class Milk extends Decorator{
	
	public Milk(Drink obj){
		super(obj);
		// TODO Auto-generated constructor stub
		super.setDesc("Milk");
		super.setPrice(2.0f);
	}

}
