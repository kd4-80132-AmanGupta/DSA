package com.sunbeam;

import java.util.Scanner;

public class Main2 {

//	searchById
	public static int searchById(Employee arr[],int empId) {
		
		for(int i=0;i<arr.length;++i) {
			if(arr[i].getEmpId() == empId) {
				return i; 
			}
		}
		return -1;
	}
	
	
	//searchByname
     public static int searchByname(Employee arr[],String name) {
    	 
    	 for(int i=0;i<arr.length;++i) {
 			if(arr[i].getName().equals(name)) {
 				return i; 
 			}
 		}
 		return -1;
		
    	 
	}
//  using binary search ->search by salary
     
    public static int searchBySalary(Employee arr[],double salary) {
    	int left = 0;
    	int right = arr.length-1;

    	while(left<=right) {
    	
    	int mid = (left+right)/2;
    	
    	if(arr[mid].getSalary() == salary)
    		return mid;
    
    	else if(salary > arr[mid].getSalary()) 
    		left=mid+1;
    	
    	else
    		right=mid-1;
    	
    	}
    	return -1;	
}

	public static void main(String[] args) {
		
		Employee arr[] = new Employee[4];
		arr[0] = new Employee(1,"aman",2000);
		arr[1] = new Employee(2,"bhim",3000);
		arr[2] = new Employee(3,"kunal",4000);
		arr[3] = new Employee(4,"shivansh",4000);
		
		
		Scanner sc= new Scanner(System.in);
		
//		searchById
//		
//		System.out.println("enter empid to be searched : ");
//		int empId = sc.nextInt();
//		
//		int i = searchById(arr,empId);
//		if(i != -1)
//			System.out.println("employee is present at index "+ i);
//		else
//			System.out.println("employee not present");
		
		
//		searchByname
//		
//		System.out.println("enter name : ");
//		String name = sc.nextLine();
//		int index = searchByname(arr,name);
//		
//		if(index != -1)
//			System.out.println("employee is present at index "+ index);
//		else
//			System.out.println("employee not present");
		
		
		
		
//		searchBySalary
	
		System.out.println("enter salary : ");
		double salary = sc.nextDouble();
		int index = searchBySalary(arr,salary);
		
		if(index != -1)
			System.out.println("employee is present at index "+ index);
		else
			System.out.println("employee not present");
//	
		
	}


}
