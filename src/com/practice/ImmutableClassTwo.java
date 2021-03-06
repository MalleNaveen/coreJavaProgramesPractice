package com.practice;

public final class ImmutableClassTwo {
	final String name; 
    final int regNo; 
  //if we use arrylist any other return unmodified collection
    public ImmutableClassTwo(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 
}
