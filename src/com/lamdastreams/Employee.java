package com.lamdastreams;

public class Employee {
	    private String empId;
	    private String name;
	    private Double salary;
	    private String department;

	    public Employee(String empId, String name, Double salary, String department) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	        this.department = department;
	    }

		

		public String getEmpId() {
			return empId;
		}

		public String getName() {
			return name;
		}

		public Double getSalary() {
			return salary;
		}

		public String getDepartment() {
			return department;
		}
	    
}
