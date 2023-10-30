package com.sunbeam;

public class Main1 {
	public static int selectionSort(int arr[]) {
		int comp=0;

		for(int i=0;i<arr.length-1;++i) {
			for(int j=i+1;j<arr.length;++j) {
				comp++;
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		System.out.println(c);
		return comp;
	}
	public static void main(String[] args) {
		int arr[] = {8,3,4,1,2,9};
		 int comp = selectionSort(arr);
		 
		 System.out.println("after sort : ");
		 for(int ele : arr) {
			 System.out.print(ele +" ");
		 }
		 System.out.println("");
		 System.out.println("no of comparison : "+comp);
	   
		
	}

}
