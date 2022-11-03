package com.bridgelabz;

public class EmployeeWage {
	
	 public static final int IS_PART_TIME = 1;
	    public static final int IS_FULL_TIME = 2;
	    private String companyName;
	    private int wagePerHr;
	    private int numWorkingDays;
	    private int maxHrsPerMonth;
	    private int totalEmpWage;
	    public EmployeeWage() {
	        this.companyName = companyName;
	        this.wagePerHr = wagePerHr;
	        this.numWorkingDays = numWorkingDays;
	        this.maxHrsPerMonth = maxHrsPerMonth;
	    }
	    public void calculateEmpWage() {
	        // Local Variables
	        int empHrs, totalEmpHrs = 0, totalWorkingDays = 0;

	        while( totalEmpHrs <= maxHrsPerMonth && totalWorkingDays <= numWorkingDays) {

	            double empCheck = Math.floor(Math.random() * 10) % 3;

	            switch ((int) empCheck) {
	                case IS_PART_TIME:
	                    System.out.println("Employee is Present as PART TIME");
	                    empHrs = 4;
	                    totalEmpHrs+=empHrs;
	                    break;
	                case IS_FULL_TIME:
	                    System.out.println("Employee is Present as FULL TIME");
	                    empHrs = 8;
	                    totalEmpHrs+=empHrs;
	                    break;
	                default:
	                    System.out.println("Employee is Absent");
	                    empHrs = 0;
	                    totalEmpHrs+=empHrs;
	                    break;
	            }
	            totalWorkingDays++;
	            System.out.println("Day No :"+ totalWorkingDays +" Emp Hrs: "+ empHrs);
	        }
	        totalEmpWage = totalEmpHrs * wagePerHr;
	        System.out.println("Total Wage For Company :"+companyName+"  is "+totalEmpWage);
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Problem");
	        EmployeeWage jio = new EmployeeWage();

	        EmployeeWage vodafone = new EmployeeWage();
	        System.out.println("JIo");
	        jio.calculateEmpWage();
	        System.out.println("**********************");
	        System.out.println("Idea");
	        vodafone.calculateEmpWage();
	    }
}
	