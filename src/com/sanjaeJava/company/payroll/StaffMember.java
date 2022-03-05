package com.sanjaeJava.company.payroll;

public class StaffMember {
    protected String firstName;
    protected String lastName;
    protected String deptNumber;
    protected double hoursWorked;

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
        //Main display method
        System.out.println("First Name : " + getFirstName());
        System.out.println("Last Name  : " + getLastName());
        System.out.println("Dept. Num  : " + getDeptNumber());
        System.out.println("Hrs Wrked  : " + getHoursWorked());

    }

    //abstract calculateSalary(getHoursWorked(), 2500, getBonus(), 1500, getAllowance());

//    abstract calculateSalary(){
//     double salary = 0.0;
//        if(deptNumber.equals("man123")){
//            salary = (getHoursWorked()*2500) + getBonus();
//            System.out.println("Manager Salary : $" + salary);
//    }
//        if(deptNumber.equals("sal123")){
//            salary = (getHoursWorked()*1500) + getAllowance();
//            System.out.println("Sales Rep Salary : $" + salary);
//        }
//
//        return salary;
//    }
}
