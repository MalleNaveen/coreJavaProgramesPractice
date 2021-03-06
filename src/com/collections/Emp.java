package com.collections;

public class Emp implements Comparable<Emp>{
	int test;
	String test2;
	
	

	public Emp(int test, String test2) {
		super();
		this.test = test;
		this.test2 = test2;
	}
	public int getTest() {
		return test;
	}
	public void setTest(int test) {
		this.test = test;
	}
	public String getTest2() {
		return test2;
	}
	public void setTest2(String test2) {
		this.test2 = test2;
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return o.getTest2().compareTo(o.getTest2());
	}
	
	// Two Employees are equal if their IDs are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp employee = (Emp) o;
        return test2 == employee.test2;
    }
	
}
