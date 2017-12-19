package com.factoty.model.one;

import com.factoty.model.one.impl.Rectangle;

/**
 * 使用该工厂，通过传递类型信息来获取实体类的对象。
 * @author gaoyj
 *
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = null;
		shape = shapeFactory.getShape("Circle");
		shape.draw();
		//反射调用
		shape = (Shape) shapeFactory.getShapeReflex(Rectangle.class);
		shape.draw();
		
	}
}
