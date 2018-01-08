package com.observer.jv;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import com.observer.Observer;
import com.observer.Subject;

public class WeatherData extends Observable{
	
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

	
	public void setDate(float mTemperatrue,float mPressure,float mHumidity){
		this.mTemperatrue = mTemperatrue;
		this.mPressure = mPressure;
		this.mHumidity = mHumidity;
		dataChange();
	}
	
	//信息通知
	public void dataChange(){
		this.setChanged();
		this.notifyObservers(new Data(getmTemperatrue(), getmPressure(), getmHumidity()));
	}
	
	public class Data
	{
		public float mTemperatrue;
		public float mPressure;
		public float mHumidity;
		public Data(float mTemperatrue,float mPressure,float mHumidity)
		{
			this.mTemperatrue=mTemperatrue;
			this.mPressure=mPressure;
			this.mHumidity=mHumidity;
		}
	}
}
