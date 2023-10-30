package com.sunbeam;

import java.util.Scanner;

public class Main4 {
	
	public static int linearSearchNthOcc(int arr[],int key) {
		int count = 0;
		boolean flag =false;
		for(int i=0;i<arr.length;++i) {
			if(arr[i]==key) {
				flag = true;
				++count;
			}
		}
		if(flag)
		return count;
		
		else
		return -1; 
	}
	
	public static void main(String[] args) {
//	4. Implement linear search algorithm to find the nth occurence of the given 
//	   element.If nth occurrence is not found, return -1.
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,3,5,2,1,2};
		System.out.println("enter key here to find its nth occurence : ");
		int key = sc.nextInt();
		int count = linearSearchNthOcc(arr,key);
				if(count!=-1)
		 System.out.printf("%d has %d occurence in array ",key,count);
				else 
					System.out.println(key+": is not present");
		
	}

}
