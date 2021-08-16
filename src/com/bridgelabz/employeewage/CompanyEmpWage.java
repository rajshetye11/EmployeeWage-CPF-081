package com.bridgelabz.employeewage;

public class CompanyEmpWage {
	
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursInMonth;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,
							int maxHoursInMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursInMonth=maxHoursInMonth;
		
	}
	
	public void setTotalWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company : " +company+ " is : " +totalEmpWage;
	}
	
	
	
}
