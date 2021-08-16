package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursInMonth;
	private int totalEmpWage;
	
	public EmployeeWageComputation(String company, int empRatePerHour, 
			int numOfWorkingDays, int maxHoursInMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}
	
	
	public void calculateWage() {
		
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
		totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for Company "+company+" is : " +totalEmpWage);  
	}

	public static void main(String[] args) 
	{
		EmployeeWageComputation apple = new EmployeeWageComputation("Apple",40,20,10);
		EmployeeWageComputation jio = new EmployeeWageComputation("Jio",20,20,10);
		System.out.println("Apple");
		apple.calculateWage();
		System.out.println("Jio");
		jio.calculateWage();
				
	}

}
