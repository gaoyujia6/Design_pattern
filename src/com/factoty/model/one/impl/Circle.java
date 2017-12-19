package com.factoty.model.one.impl;

import com.factoty.model.one.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
