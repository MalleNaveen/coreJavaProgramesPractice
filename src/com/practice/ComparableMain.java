package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

    public static void main(final String args[]) {
        // Takes a list of Employee objects
        final List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee(30, "Zaheer"));
        empList.add(new Employee(25, "Ashwin"));
        empList.add(new Employee(31, "Karnan"));

        // Sorts the array list
        Collections.sort(empList);

        // displays the sorted list of names
        for (final Employee a : empList) {
            System.out.print(a.getEmpName() + ", ");
        }

        // Sorts the array list using comparator
        Collections.sort(empList, new Employee());
        System.out.println(" ");
        // displays the sorted list of ages
        for (final Employee a : empList) {
            System.out.print(a.getEmpName() + "  : " + a.getEmpId() + ", ");
        }
    }
}
