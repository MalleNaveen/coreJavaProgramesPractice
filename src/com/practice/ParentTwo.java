package com.practice;

public class ParentTwo {

    ParentTwo(){
        System.out.println("default parenttwo");
    }
    ParentTwo(int sal){
        System.out.println("parenttwo");
    }
    public int getEmpSal(int sal){
        System.out.println("parent");
        return 0;
    }
}
