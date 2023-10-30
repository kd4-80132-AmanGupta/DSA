package com.sunbeam;

import java.util.Scanner;

public class Main6 {

	public static int find(int arr[],int key) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=key)
				++count;
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {1,10, 20, 15, 3, 4, 4, 1,2 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key : ");
		int key = sc.nextInt();
		
		int count = Main6.find(arr,key);
		System.out.println("rank of "+key +" is : "+count);
	}

}
