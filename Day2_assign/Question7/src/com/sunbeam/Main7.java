package com.sunbeam;

import java.util.Scanner;

//7. Write program to implement linear queue in which front and rear starts at 0.

public class Main7 {
	public static void main(String[] args) {
		Queue q = new Queue();
		Scanner sc = new Scanner(System.in);
		int choice;
		
//		
		do {
			System.out.println("0. Exit");
			System.out.println("1. to push");
			System.out.println("2. to pop");
			System.out.println("3. to peek");
			
			System.out.println("enter your choice :");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 :System.out.println("enter any number to push");
			        int data = sc.nextInt();
			          if(q.push(data))
			        	  System.out.println(data+" added");
			          
			          else 
			        	  System.out.println("data cannot be added as queue is full");
				break;
				
			case 2 : if(q.pop())
				     System.out.println("1 data popped");
			else 
				System.out.println("nothing to pop as queue is empty");
				break;
				
			case 3 : int d = q.peek();
				     if(d !=-1)
				     System.out.println("peeked data : "+d);
				     else 
				    	 System.out.println("nothing to peek");
				break;
				
				default  :
					System.out.println("invalid input");
				break;
			}
			
		}while(choice!=0);
		
	}
	  
}
