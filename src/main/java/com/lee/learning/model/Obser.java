package com.lee.learning.model;
/**
 * 观察者接口 
 * @author Administrator
 *
 */
public interface Obser {
	public void update();
	public void subscribe(ObservableInterface observable);
}
