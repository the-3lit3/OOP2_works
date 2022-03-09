package com.sanjaeJava.company.payroll;

public class childCalculateSalary extends Calculate_Salary{
    public childCalculateSalary(String firstName, String lastName, String deptNumber, double hoursWorked, double r) {
        super(firstName, lastName, deptNumber, hoursWorked, r);
    }

    @Override
    public double calculateSalary() {
        salary = (getHoursWorked() * rate);
        if(rate == 1500){
            salary += 5000.00; //$5000 is the Sales Rep allowance
            System.out.println("=======================================================================================");
            System.out.println("======================== SALES REPRESENTATIVE =========================================");
            System.out.println("=======================================================================================\n");
            System.out.println("Employee Name         : " + getFirstName() + " " + getLastName());
            System.out.println("Department Number     : " + getDeptNumber());
            System.out.println("Hours Worked          : " + getHoursWorked());
            //System.out.println("Sales Rep Allowance      : $" + getAllowance());
            System.out.println("Salary : $" + salary);
        }

        if(rate == 2500){
            salary += 1000.00; //$10000 is the Manager bonus
            System.out.println("=======================================================================================");
            System.out.println("======================== MANAGER ======================================================");
            System.out.println("=======================================================================================\n");
            System.out.println("Employee Name         : " + getFirstName() + " " + getLastName());
            System.out.println("Department Number     : " + getDeptNumber());
            System.out.println("Hours Worked          : " + getHoursWorked());
            //System.out.println("Sales Rep Allowance      : $" + getAllowance());
            System.out.println("Salary : $" + salary);
        }

        return salary;
    }

//    @Override
//    public void display() {
//        System.out.println("=======================================================================================");
//        System.out.println("======================== SALES REPRESENTATIVE =========================================");
//        System.out.println("=======================================================================================\n");
//        System.out.println("Employee Name         : " + getFirstName() + " " + getLastName());
//        System.out.println("Department Number     : " + getDeptNumber());
//        System.out.println("Hours Worked          : " + getHoursWorked());
//        //System.out.println("Sales Rep Allowance      : $" + getAllowance());
//        System.out.println("Salary : $" + salary);
//    }
}
