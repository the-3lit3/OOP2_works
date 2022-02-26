package com.sanjaeJava.company.payroll;

public class StaffMember {
    private String firstName;
    private String lastName;
    private String deptNumber;
    private double hoursWorked;

    public StaffMember(String firstName, String lastName, String deptNumber, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void display(){
        System.out.println("First Name : " + getFirstName());
        System.out.println("Last Name  : " + getLastName());
        System.out.println("Dept. Num  : " + getDeptNumber());
        System.out.println("Hrs Wrked  : " + getHoursWorked());

    }
}
