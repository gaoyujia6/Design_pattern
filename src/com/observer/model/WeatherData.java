package com.observer.model;

import java.util.ArrayList;
import java.util.List;

import com.observer.Observer;
import com.observer.Subject;

public class WeatherData implements Subject{
	
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	private List<Observer> observerList;
	
	public WeatherData(){
		observerList = new ArrayList<Observer>();
	}

	public float getmTemperatrue() {
		return mTemperatrue;
	}


	public float getmPressure() {
		return mPressure;
	}


	public float getmHumidity() {
		return mHumidity;
	}


	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void remove(Observer o) {
		// TODO Auto-generated method stub
		if(observerList.contains(o)){
			observerList.remove(o);
		}
	}

	@Override
	public void notifys() {
		for(int i=0; i<observerList.size(); i++){
			observerList.get(i).update(getmTemperatrue(), getmPressure(), getmHumidity());
		}
	}
	
	public void setDate(float mTemperatrue,float mPressure,float mHumidity){
		this.mTemperatrue = mTemperatrue;
		this.mPressure = mPressure;
		this.mHumidity = mHumidity;
		notifys();
	}

}
