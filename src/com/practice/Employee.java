package com.practice;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
    int empId;
    String empName;

    public Employee() {

    }

    @Override
    public int compareTo(final Employee emp) {

        return empName.compareTo(emp.empName);

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(final int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(final String empName) {
        this.empName = empName;
    }

    public Employee(final int empId, final String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public int compare(final Employee o1, final Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());

    }

}
