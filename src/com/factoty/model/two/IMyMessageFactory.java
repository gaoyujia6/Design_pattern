package com.factoty.model.two;

/**
 * 工厂方法模式_工厂接口 
 * @author gaoyj
 *
 */
public interface IMyMessageFactory {

	public IMyMessage createMessage(String messageType);  
	
}
