package com.factoty.impl;

import com.factoty.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

} 
