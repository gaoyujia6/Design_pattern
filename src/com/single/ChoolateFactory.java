package com.single;

/**
 * 双重检测枷锁法
 * @author Administrator
 *
 */
public class ChoolateFactory {
	
	private boolean empty;		//是否有原材料
	private boolean boiled;		//是否加热
	private volatile static ChoolateFactory instance = null;

	public static ChoolateFactory getInstance(){
		if(instance==null){
			synchronized (ChoolateFactory.class) {
				if(instance==null){
					return new ChoolateFactory();
				}
			}
		}
		return instance;
	}
	
	private ChoolateFactory(){
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		if (empty) {
			// 添加原料巧克力动作
			empty = false;
			boiled = false;
		}
	}
	
	public void boil() {
		if ((!empty) && (!boiled)) {
			// 煮沸
			boiled = true;
		}
	}

	public void drain() {
		if ((!empty) && boiled) {
			// 排出巧克力动作
			empty = true;
		}
	}

}
