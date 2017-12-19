package com.factoty.model.one.impl;

import com.factoty.model.one.Shape;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
