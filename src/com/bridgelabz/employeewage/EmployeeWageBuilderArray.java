package com.bridgelabz.employeewage;

public class EmployeeWageBuilderArray {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmployeeWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyWage(String company, int empRatePerHour,int numOfWorkingDays,
							int maxHoursInMonth) 
	{
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,
															numOfWorkingDays,maxHoursInMonth);
		numOfCompany++;
	}
	
	private void calculateWage() {
		for (int i=0; i<numOfCompany;i++) {
			companyEmpWageArray[i].setTotalWage(this.calculateWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	private int calculateWage(CompanyEmpWage companyEmpWage) {
			int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while(totalEmpHrs <= companyEmpWage.maxHoursInMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
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
		return totalEmpHrs*companyEmpWage.empRatePerHour;
	}
	
	public static void main(String[] args) {
		EmployeeWageBuilderArray empWageBuild = new EmployeeWageBuilderArray();
		empWageBuild.addCompanyWage("Apple", 40, 20, 10);
		empWageBuild.addCompanyWage("Jio", 20, 20, 10);
		empWageBuild.calculateWage();

	}
}
