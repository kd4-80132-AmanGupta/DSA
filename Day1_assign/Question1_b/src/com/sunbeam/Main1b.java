package com.sunbeam;

import java.util.Scanner;

public class Main1b {

	public static void binarySearch(int arr[],int key) {
		int comp=0;
		int left = 0;
		int right = arr.length-1;
		int mid=0;
		
		while(left<=right) { 
		 mid = (left+right)/2;
		 comp++;
		if(arr[mid] == key) {
			System.out.println("key present at index : "+mid);
		    System.out.println("no of comparison : "+comp);
		    break;
		}
		else if(key > arr[mid]) {
			left = mid+1;
		}
		else
			right = mid-1; 
			
		}
	}
	public static void main(String[] args) {
//		. Write a program to print no of comparisions done to search a key in
//		i. linear search
//		ii. binary serach
		Scanner sc= new Scanner(System.in);
		
		int arr[] = {11,22,33,44,55,66,77};
		System.out.println("enter any number from this array to search  {11,22,33,44,55,66,77}");
		int key = sc.nextInt();
		
		binarySearch(arr,key);
	}
	

}
