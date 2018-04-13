//package com.lee.learning.days20180412;
///**
// * hashmap的实现原理
// * @author Administrator
// *
// */
//public class SelfHashMap<K,V> {
//	
//	public static int start_size=10;
//	public static int current_size;
//	public Node[] arr=new Node[start_size];
//	
//	
//	
//	public void add(K key,V value){
//		int hashCode=key.hashCode(
//				
//				
//				
//				
//				
//				);
//		int index=hashCode%current_size;
//		if(arr[index]==null){
//			arr[index]=new Node<K, V>(key, value);
//		}
//		Node temp=arr[index];
//		while(temp.next!=null)
//		{
//			int s = 1;
//		}
//	
//	}
//	
//	
//	 class Node<K,V>
//	 {
//		public Node(K k,V v){
//			this.data=v;
//			this.key=k;
//		}
//		private V data;
//		private K key;
//		private Node<K,V> next;
//		public V getData() {
//			return data;
//		}
//		public void setData(V data) {
//			this.data = data;
//		}
//		public K getKey() {
//			return key;
//		}
//		public void setKey(K key) {
//			this.key = key;
//		}
//		public Node<K,V> getNext() {
//			return next;
//		}
//		public void setNext(Node<K,V> next) {
//			this.next = next;
//		}
//
////}
