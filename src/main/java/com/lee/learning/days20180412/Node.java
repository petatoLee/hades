package com.lee.learning.days20180412;

public class Node<K,V> {
	private V data;
	private K key;
	private Node<K,V> next;
	public V getData() {
		return data;
	}
	public void setData(V data) {
		this.data = data;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public Node<K,V> getNext() {
		return next;
	}
	public void setNext(Node<K,V> next) {
		this.next = next;
	}
	
	
	

}
