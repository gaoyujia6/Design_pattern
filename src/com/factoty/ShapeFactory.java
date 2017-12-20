package com.factoty;


import com.factoty.impl.Circle;
import com.factoty.impl.Rectangle;
import com.factoty.impl.Square;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * @author gaoyj
 *
 */
public class ShapeFactory {
	
	//该方法每次增加一个对象都要修改工厂的内容，下面的我们用反射的方式重新定义工厂
	public Shape getShape(String factoryName){
		if(null==factoryName && "".equals(factoryName)){
			return null;
		}else if("Circle".equals(factoryName)){
			return new Circle();
		}else if("Rectangle".equals(factoryName)){
			return new Rectangle();
		}else if("Square".equals(factoryName)){
			return new Square();
		}else{
			return null;
		}
	} 
	
	//反射实现工厂
	public Object getShapeReflex(Class<?extends Shape> clazz){
		Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
	}

}
