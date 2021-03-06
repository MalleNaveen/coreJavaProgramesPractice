package com.practice;

public class ChildTwo extends ParentTwo{
     
    public ChildTwo(int sal){
       // System.out.println("param constructor childTwo");
    }
    
    public ChildTwo(){
        System.out.println("defualt childTwo");
    }
    public int getEmpSal(long sal){
        System.out.println("child");
        return 0;
    }
    public static void main(String args[]){
        ParentTwo pTwo=new ChildTwo(10);
        //ParentTwo parentTwo=new ParentTwo();
       // ChildTwo cTwo=new ChildTwo();//obect one
        //ParentTwo pTwo2=new ChildTwo();
        //pTwo.getEmpSal(10);
        //cTwo.getEmpSal(10);
    }
}
