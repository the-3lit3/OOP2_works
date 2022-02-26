package com.sanjaeJava.company.payroll;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("=======================================================================================\n");
        StaffMember nStaff = new StaffMember("Sanjae", "Facey", "JFB08028", 40);

        nStaff.display();
        System.out.println("=======================================================================================\n");

        Scanner scan = new Scanner(System.in);

        SalesRep s1 = new SalesRep("sanjae", "Facey","uisdh1123",8, 500.0);

        s1.display();
        //x = scan.nextDouble();
        //s1.setAllowance(x);
        //System.out.println(s1.getAllowance());

        SalesRep[] salesRepList = {
                new SalesRep("Jenny", "Bartley","2039man", 8, 5),
                new SalesRep("Stephen", "Bailey","2039man", 8, 5),
                new SalesRep("Randy", "Fenton","2039man", 8,5),
                new SalesRep("Marlon", "Williams","2039man", 8,5),
                new SalesRep("Karen", "Fenty","2039man", 8,5)
        } ;
        System.out.println("=======================================================================================\n");
        List<SalesRep> showRepList1 = Arrays.asList(salesRepList);
        System.out.println("Employee List : ");
        System.out.println("=======================================================================================\n");
        showRepList1.stream().iterator().forEachRemaining(System.out::println);
    }
}
