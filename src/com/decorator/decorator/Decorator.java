package com.decorator.decorator;

import com.decorator.Drink;

/**
 * 
 * @author Administrator
 *
 */
public class Decorator extends Drink{
	
	private Drink obj;
	
	public Decorator(Drink obj) {
		this.obj = obj;
	}

	@Override
	public float cost() {
		return super.getPrice()+obj.cost();
	}
	
	@Override
	public String getDesc()
	{
		return super.desc+"-"+super.getPrice()+"&&"+obj.getDesc();
	}

}
