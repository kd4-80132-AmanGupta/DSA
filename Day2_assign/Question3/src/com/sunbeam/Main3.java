package com.sunbeam;

import java.util.Arrays;

public class Main3 {
	
	public static void insertionSort(int arr[]) {
		
		for(int i=1;i<arr.length;++i) {
			
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				--j;				
			}
			arr[j+1]=temp;			
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {9,2,1,4,10};
		
		insertionSort(arr);
		
		System.out.println("after sort : ");
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
