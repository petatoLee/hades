package com.lee.learning.model;
/**
 * 被观察这
 * @author Administrator
 *
 */
public interface ObservableInterface {
	public void addObser(Obser obser);
	public void deleteObser(Obser obser);
	public void notifyAllObject();
}
