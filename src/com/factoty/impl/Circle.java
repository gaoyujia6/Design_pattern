package com.factoty.impl;

import com.factoty.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

} 
