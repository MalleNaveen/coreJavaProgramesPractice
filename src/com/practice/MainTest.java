package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(final String args[]) {
        // Takes a list of Employee34 objects
        final List<Employee34> empList = new ArrayList<Employee34>();

        empList.add(new Employee34(30, "Zaheer"));
        empList.add(new Employee34(25, "Ashwin"));
        empList.add(new Employee34(31, "Karnan"));

        // displays the sorted list of names
        for (final Employee34 a : empList) {
            System.out.print(a.getEmpName() + ", ");
        }

        // Sorts the array list using comparator
        System.out.println(" ");
        // displays the sorted list of ages
        for (final Employee34 a : empList) {
            System.out.print(a.getEmpName() + "  : " + a.getEmpId() + ", ");
        }
    }

}
