package com.bridgelabz;

public class EmployeeWage {
	static final int  WAGE_PER_HOUR = 20;
	static final int TOTAL_WORKING_HRS=100;
	static final int WORKING_DAY_PER_MONTH = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int FULLTIME=1;
    static final int PARTTIME=2;

	public static void main(String[] args) {
		int empwage=0, workingday = 1, totalempwage = 0, workingHrs=0;
		System.out.println("Welcome to Employee Wage Computation Problem");
		while (workingday <= WORKING_DAY_PER_MONTH && workingHrs<=TOTAL_WORKING_HRS) {
            double empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empcheck) {
                case FULLTIME:
                    System.out.println("Employee is Present");
                    empwage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("working days: " + workingday);
                    System.out.println("EmpWage: " + empwage);
                    totalempwage = empwage + totalempwage;
                    workingHrs = workingHrs + FULL_DAY_HOUR;
                    break;
                case PARTTIME:
                    System.out.println("Employee is Part-time");
                    empwage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("working days: " + workingday);
                    System.out.println("EmpWage: " + empwage);
                    totalempwage = empwage + totalempwage;
                    workingHrs = workingHrs + PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is Abscent");
                    System.out.println("working days: " + workingday);
                    System.out.println("EmpWage: " + empwage);
                    break;
            }
            workingday++;
        }
        System.out.println("--------------");
        System.out.println("Total Working Hrs:>" + workingHrs + "\n-------------- \nTotal Wage:>" + totalempwage);
    }
}
