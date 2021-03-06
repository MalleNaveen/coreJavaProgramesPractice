package com.practice;

public class Person {
	public int personId;
    public String firstName;
    public String lastName;
    public Person(int personId, String firstName, String lastName) {
        super();
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    

}
