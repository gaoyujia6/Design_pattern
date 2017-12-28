package com.single.thress;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton(){}
	
	public static synchronized Singleton getInstance(){
		if(instance == null){
			return new Singleton();
		}
		return instance;
	}
	
	public void sendMessage(){
		System.out.println("Hello World");
	}

}
