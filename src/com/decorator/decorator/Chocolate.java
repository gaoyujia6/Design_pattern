package com.decorator.decorator;

import com.decorator.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink Obj) {		
		super(Obj);
		// TODO Auto-generated constructor stub
		super.setDesc("Chocolate");
		super.setPrice(3.0f);
	}

}
