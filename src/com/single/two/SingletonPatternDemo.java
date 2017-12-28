package com.single.two;

public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.sendMessage();
	}

}
