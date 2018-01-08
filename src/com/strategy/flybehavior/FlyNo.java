package com.strategy.flybehavior;

public class FlyNo implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("不会飞");
	}

}
