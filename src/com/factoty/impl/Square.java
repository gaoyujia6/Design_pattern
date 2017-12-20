package com.factoty.impl;

import com.factoty.Shape;

public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

} 
