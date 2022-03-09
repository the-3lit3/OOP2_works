package com.sanjaeJava.company.payroll;

public abstract class Calculate_Salary extends StaffMember{
    protected double salary;
    protected double rate;
    public Calculate_Salary(String firstName, String lastName, String deptNumber, double hoursWorked, double r){
        super(firstName, lastName, deptNumber, hoursWorked);
        salary = 0.00;
        rate = r;
    }

    public abstract double calculateSalary();
    //public abstract void display();

}
