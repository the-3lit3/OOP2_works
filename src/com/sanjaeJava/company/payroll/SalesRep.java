package com.sanjaeJava.company.payroll;

public class SalesRep extends StaffMember{
    private double allowance;
    public SalesRep(String firstName, String lastName, String deptNumber, double hoursWorked, double al){//
        super(firstName, lastName, deptNumber, hoursWorked);
        this.allowance = al;
    }
    public void setAllowance(double setAllowance){
//        System.out.print("\nAllowance Percentage (%) : ");

    }

    public double getAllowance(){
        //this.allowance += (getHoursWorked() * 1500);
        return allowance;
    }

    @Override//Override for printing out the list of employees first and last names
    public String toString() {
        String fullName = getFirstName() + " " + getLastName();
        return fullName;
    }
    public void display(){
        //Override method for displaying sales rep information
        System.out.println("=======================================================================================");
        System.out.println("======================== SALES REPRESENTATIVE =========================================");
        System.out.println("=======================================================================================\n");
        System.out.println("Employee Name         : " + getFirstName() + " " + getLastName());
        System.out.println("Department Number     : " + getDeptNumber());
        System.out.println("Hours Worked          : " + getHoursWorked());
        System.out.println("Sales Rep Allowance      : $" + getAllowance());
        double salary = (getHoursWorked()*1500) + getAllowance();
        System.out.println("Sales Rep Salary      : $" + salary);

    }

}

