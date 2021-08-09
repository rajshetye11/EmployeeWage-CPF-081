package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	
	public static void main(String[] args) 
	{
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int NUM_OF_WORKING_DAYS = 20;
		int MAX_HOURS_IN_MONTH = 10;
		
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while(totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			
			switch(empCheck) 
			{
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;	
				default: 
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "Emp Hr:" +empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage : " + totalEmpWage);
		
		
		
		
		   //UC5

	}

}
