package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	public static void calculateWage(String company, int empRatePerHour, 
										int numOfWorkingDays, int maxHoursInMonth) {
		
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while(totalEmpHrs <= maxHoursInMonth && totalWorkingDays < numOfWorkingDays)
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
			System.out.println("Day: " + totalWorkingDays + "Emp Hr:" +empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for Company "+company+" is : " + totalEmpWage);  
//		return totalEmpWage; instead of void use int to return int value
	}
	
	public static void main(String[] args) 
	{
		calculateWage("Apple",40,20,10); //UC8
		calculateWage("Jio",20,20,10); //UC8
	}

}
