package com.sunbeam;

import java.util.Scanner;

public class Main1 {
	
	public static void linearSearch(int arr[],int key) {
		int cmp = 0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			cmp++;
			if(key == arr[i]) {
				System.out.println(key+" present at index : "+i);
				System.out.println("no of comparison is : "+cmp);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(key +" : is not present");
		}
		
	}
	public static void main(String[] args) {
//		1. Write a program to print no of comparisions done to search a key in
//		i. linear search

		Scanner sc = new Scanner(System.in);
		int arr[] = {23,45,11,76,32,98};
		System.out.println("enter any no. from this array to search -> 23,45,11,76,32,98");
		int key = sc.nextInt();
		
		linearSearch(arr,key);
		
	}

}
