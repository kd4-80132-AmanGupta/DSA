package com.sunbeam;

public class Main2 {
	public static int bubbleSort(int arr[]) {
		int comp=0;
		for(int i=0;i<arr.length-1;++i){
			boolean flag = true;
			for(int j=0;j<arr.length-(i+1);++j) {
				comp++;
				if(arr[j]>arr[j+1]){
					flag = false;
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			if(flag)
			break;
			
		}
		return comp;
		
		
	}
	public static void main(String[] args) {
//		Write a bubble sort function to sort array and returns no of comparisions.
		
		int arr[] = {1,2,3,54,4,66};
		int comp = bubbleSort(arr);
		
		System.out.println("after sort : ");
		 for(int ele : arr) {
			 System.out.print(ele +" ");
		 }
		 System.out.println("");
		 System.out.println("no of comparison : "+comp);
	   
	}

}
