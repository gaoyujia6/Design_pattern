package com.abstractFactory.one;

public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color color = colorFactory.getColor("GREEN");
		color.fill();
	}

}
