package com.sanjaeJava.company.payroll;

public class Manager extends StaffMember{
    private Double bonus;
    public Manager(String firstName, String lastName, String deptNumber, Double hoursWorked, Double b){
        super(firstName, lastName, deptNumber, hoursWorked);
        this.bonus = b;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        System.out.print("\nBonus : $");
        this.bonus = getHoursWorked() * bonus;
    }
    public void display(){
        System.out.print("Enter Bonus Percentage (%) : ");
    }
}
