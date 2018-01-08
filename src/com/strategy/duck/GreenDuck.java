package com.strategy.duck;

import com.strategy.flybehavior.FlyBad;
import com.strategy.quackbehavior.GaGa;

public class GreenDuck extends Duck{

	public GreenDuck(){
		flyBehavior = new FlyBad();
		quackBehavior = new GaGa();
	}
	
	@Override
	public void display() {
		System.out.println("我是绿色的鸭子");
	}

}
