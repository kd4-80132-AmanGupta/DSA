package com.sunbeam;

public class Queue {
	
	private int front=0;
	private int rear=0;
	private final int SIZE=5; 
	private int arr[];
	
	public Queue() {
		arr = new int[SIZE];
		
	}
	
	public boolean push(int data) {
		if(!isFull()){
			arr[rear] = data;
			++rear;	
			return true;
		}
		else {	
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(front==rear){
			return true;
		}
		
		return false;
	}
	
	public boolean pop() {
		if(!isEmpty()) {
			arr[front] = 0;
			front++;
			return true;
		}
		return false;
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[front];
		}
		return -1;
	}
	
	public boolean isFull() {
		if(rear == SIZE) {
			if(front==rear)
			return false;
			else 
		    return true;
		}
				
		
		return false;
	}
	

}
