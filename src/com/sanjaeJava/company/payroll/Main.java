package com.sanjaeJava.company.payroll;
import java.util.*;

public class Main {

    public static void main(String[] args) {
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
                new SalesRep("Jenny", "Bartley","2039man", 8, 5),
                new SalesRep("Stephen", "Bailey","2039man", 8, 5),
                new SalesRep("Randy", "Fenton","2039man", 8,5),
                new SalesRep("Marlon", "Williams","2039man", 8,5),
                new SalesRep("Karen", "Fenty","2039man", 8,5)
        } ;
        System.out.println("=======================================================================================\n");
        //Code to display all the Sales Representatives that are added to the database
        List<SalesRep> showRepList1 = Arrays.asList(salesRepList);
        System.out.println("Employee List : ");
        System.out.println("=======================================================================================\n");
        showRepList1.stream().iterator().forEachRemaining(System.out::println);

        SalesRep s1 = new SalesRep("sanjae", "Facey","sales123",40.0, 1500.0);
        Manager m1 = new Manager("Junior", "Reid", "man123", 40.0, 2500.0);
        s1.display();
        m1.display();


    }
}
