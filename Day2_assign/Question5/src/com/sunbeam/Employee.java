package com.sunbeam;

public class Employee {
	
	private int empid;
	private double salary;
	

	public Employee() {
	}
	
	public Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
