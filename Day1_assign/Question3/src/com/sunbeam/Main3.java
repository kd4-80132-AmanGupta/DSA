package com.sunbeam;

import java.util.Scanner;

public class Main3 {
	public static int binarySearchArrIsSortedDesc(int arr[],int key) {
	int left = 0;
	int right = arr.length-1;

	while(left<=right) {
	
	int mid = (left+right)/2;
	
	if(arr[mid] == key)
		return mid;

	else if(key > arr[mid]) 
		right=mid-1;
	
	else
		left=mid+1;
	
	}
	return -1;	
 }

	
	
	public static void main(String[] args) {

//3. Implement binary search algorithm if array is sorted in descending order.
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {88,77,66,55,44,33,22,11};
		System.out.println("enter key here to find : ");
		int key = sc.nextInt();
		int i = binarySearchArrIsSortedDesc(arr,key);
		if(i != -1)
		System.out.println("key found at index : "+i);
		else 
			System.out.println("key not found");
		sc.close();
	}

}
