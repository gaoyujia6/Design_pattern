package com.strategy.duck;

import com.strategy.flybehavior.FlyNo;
import com.strategy.quackbehavior.WuWu;

public class RedDuck extends Duck{

	public RedDuck(){
		flyBehavior = new FlyNo();
		quackBehavior = new WuWu();
	}
	
	@Override
	public void display() {
		System.out.println("我是红色的鸭子");
	}

}
