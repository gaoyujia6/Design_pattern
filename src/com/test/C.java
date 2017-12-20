package com.test;

public class C extends B{

	public void operation5() {
		System.out.println("我是重写的"+5);
	}

	@Override
	public void operation6() {
		System.out.println("我是必须实现的"+6);
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.operation5();
		c.operation6();
	}
	
}
