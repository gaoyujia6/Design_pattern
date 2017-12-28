package com.single.thress;

public class SingletonPattrenDemo {
	
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.sendMessage();
	}

}
