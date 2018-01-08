package com.observer.model;

public class Test {
	
	public static void main(String[] args) {
		//第一个观察者
		CurrentConditions currentConditions = new CurrentConditions();
		//第二个观察者
		ForcastConditions forcastConditions = new ForcastConditions();
		
		WeatherData weatherData = new WeatherData();
		weatherData.register(forcastConditions);
		weatherData.register(currentConditions);
		weatherData.setDate(10, 20, 30);
	}

}
