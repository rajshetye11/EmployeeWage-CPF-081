package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	
	public static void main(String[] args) 
	{
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");   //UC1
		else
			System.out.println("Employee is Absent");	 //UC1

	}

}
