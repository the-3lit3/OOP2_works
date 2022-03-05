package com.sanjaeJava.company.payroll;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        double salary = 0.0;
        System.out.println("=======================================================================================\n");
        //Call to the StaffMember class constructor to which initial arguments are passed
        StaffMember nStaff = new StaffMember("Sanjae", "Facey", "JFB08028", 40);
        //Call to the StaffMember class display method
        nStaff.display();
        System.out.println("=======================================================================================\n");

        //Scanner scan = new Scanner(System.in);
        //x = scan.nextDouble();
        //s1.setAllowance(x);
        //System.out.println(s1.getAllowance());

        //Sales Representatives are added to the system using an array list
        SalesRep[] salesRepList = {
                new SalesRep("Jenny", "Bartley", "man123", 8, 5),
                new SalesRep("Stephen", "Bailey", "sal123", 8, 5),
                new SalesRep("Randy", "Fenton", "sal123", 8, 5),
                new SalesRep("Marlon", "Williams", "sal123", 8, 5),
                new SalesRep("Karen", "Fenty", "man123", 8, 5)
        };
        System.out.println("=======================================================================================\n");
        //Code to display all the Sales Representatives that are added to the database
        List<SalesRep> showRepList1 = Arrays.asList(salesRepList);
        System.out.println("Employee List : ");
        System.out.println("=======================================================================================\n");
        showRepList1.stream().iterator().forEachRemaining(System.out::println);

        SalesRep s1 = new SalesRep(nStaff.getFirstName(), nStaff.getLastName(), nStaff.getDeptNumber(), nStaff.getHoursWorked(), 1500.0);
        Manager m1 = new Manager("Junior", "Reid", "man123", 40.0, 2500.0);
        s1.display();
        m1.display();

//        SalesRep s2 = new SalesRep("", "", "", 0.0, 0.0);
//        int i;
//        for (i = 0; i < showRepList1.size(); i++){
//            if (s2.deptNumber == "man123") {
//                //showRepList1.forEach((n) -> calculateSalary(getHoursWorked(), 2500) + getBonus);
//                salary = (s2.getHoursWorked() * 2500) + m1.getBonus();
//                m1.display();
//                System.out.println("Manager Salary is : $" + salary);
//            }
//            if (s2.deptNumber == "sal123") {
//                //showRepList1.forEach((n) -> calculateSalary(getHoursWorked(), 1500) + getAllowance);
//                salary = (s2.getHoursWorked() * 1500) + s2.getAllowance();
//                s2.display();
//                System.out.println("Sales Salary is : $" + salary);
//            }
//        }


    }
}
