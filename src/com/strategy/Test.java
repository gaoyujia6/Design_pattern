package com.strategy;

import com.strategy.duck.Duck;
import com.strategy.duck.GreenDuck;
import com.strategy.duck.RedDuck;
import com.strategy.flybehavior.FlyGood;
import com.strategy.quackbehavior.GeGe;

public class Test {
	
	public static void main(String[] args) {
		
		Duck gerrn = new GreenDuck();
		Duck red = new RedDuck();
		
		System.out.println("-------------------");
		gerrn.display();
		gerrn.Quack();
		gerrn.Fly();
		gerrn.swin();
		
		System.out.println("-------------------");
		red.display();
		red.Quack();
		red.Fly();
		red.swin();
		
		System.out.println("------动态赋值-----");
		red.display();
		red.setQuackBehavior(new GeGe());
		red.Quack();
		red.setFlyBehavior(new FlyGood());
		red.Fly();
		red.swin();
		
	}

}
