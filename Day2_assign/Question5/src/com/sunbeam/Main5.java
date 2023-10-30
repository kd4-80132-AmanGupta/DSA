package com.sunbeam;

import java.util.Arrays;

//5. Write a function to sort employees by their salary.

public class Main5 {
	
	public static void sortBySalary(Employee e[]) {
		for(int i=1;i<e.length;++i) {
			double tempSal =e[i].getSalary();
			int j=i-1;
			
			while(j>=0 && e[j].getSalary()>tempSal) {
				
				e[j+1].setSalary(e[j].getSalary());	
				--j;
			}
			e[j+1].setSalary(tempSal);			
		}
	}
		
	
	public static void main(String[] args) {
		Employee e[] = new Employee[5];
		
		e[0] = new Employee(1,3800);
		e[1] = new Employee(4,800);
		e[2] = new Employee(2,2500);
		e[3] = new Employee(7,4300);
		e[4] = new Employee(9,2200);
		
		sortBySalary(e);
		
		System.out.println("after sorting the emp By Salary : ");
		System.out.println(Arrays.toString(e));
		
		
		
	}

}
