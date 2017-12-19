package com.factoty.model.one.impl;

import com.factoty.model.one.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
