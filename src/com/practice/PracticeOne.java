package com.practice;

public class PracticeOne {
    public static void main(final String args[]) {
        final PracticeOne p = new PracticeOne();
       // p.getInt(10, 20f);
        //p.getInt(20f, 30);
        try{
            System.out.println("try");
        }catch(Exception e){
            System.out.println("exce");
        }finally{
            System.out.println("final");
        }
    }

    public void getInt( int a,  float b) {
        
        System.out.println(a + b);

    }

    public void getInt( float a,  int b) {
        System.out.println(a + b);

    }

}
