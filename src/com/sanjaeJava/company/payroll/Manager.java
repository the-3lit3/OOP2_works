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

//    public void setBonus(Double bonus) {
//        System.out.print("\nBonus : $");
//        this.bonus = getHoursWorked() * bonus;
//    }
    public void display(){
        //Override method for displaying the manager information
        System.out.println("=======================================================================================");
        System.out.println("======================== MANAGER =====================================================");
        System.out.println("=======================================================================================\n");
        System.out.println("Employee Name         : " + getFirstName() + " " + getLastName());
        System.out.println("Department Number     : " + getDeptNumber());
        System.out.println("Hours Worked          : " + getHoursWorked());
        System.out.println("Manager Bonus         : $" + getBonus());
        //double salary = calculateSalary(getHoursWorked(), 2500) + getBonus; Abstract method called to calculate salary
        double salary = (getHoursWorked()*2500) + getBonus();
        System.out.println("Manager Salary         : $" + salary);

    }
}
