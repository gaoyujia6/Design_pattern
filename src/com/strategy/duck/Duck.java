package com.strategy.duck;

import com.strategy.flybehavior.FlyBehavior;
import com.strategy.quackbehavior.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){}
	
	public void Fly(){
		flyBehavior.fly();
	}
	
	public void Quack(){
		quackBehavior.quack();
	}
	
	public abstract void display();

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void swin(){
		System.out.println("会游泳");
	}
	
	
}
