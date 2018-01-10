package com.decorator.decorator;

import com.decorator.Drink;

public class Soy extends Decorator {

	public Soy(Drink Obj) {		
		super(Obj);
		// TODO Auto-generated constructor stub
		super.setDesc("Soy");
		super.setPrice(1.5f);
	}

}

