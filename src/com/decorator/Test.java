package com.decorator;

import com.decorator.coffee.Decaf;
import com.decorator.coffee.ShortBlack;
import com.decorator.decorator.Milk;
import com.decorator.decorator.Soy;

public class Test {

	
	public static void main(String[] args) {
		
		//单独点一杯咖啡
		Drink order;
		order = new Decaf();
		System.out.println(order.getPrice());
		System.out.println(order.getDesc());
		
		System.out.println("####################################");
		order = new ShortBlack();
		order = new Milk(order);
		order = new Soy(order);
		System.out.println(order.cost());
		System.out.println(order.getDesc());
	}
}
