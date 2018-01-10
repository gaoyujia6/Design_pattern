package com.decorator.coffee;

import com.decorator.Drink;

/**
 * 咖啡中间层
 * @author Administrator
 *
 */
public class Coffee extends Drink{

	@Override
	public float cost() {
		return super.getPrice();
	}

}
