package com.single.thress;

public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		SingleObject instace = SingleObject.getInstace();
		instace.sendMessage();
	}

}
