package com.practice;

public class Test2 {
    String i;

    public static void main(final String[] args) {
        final Test2 test = new Test2();
        test.getAdd();
    }

    public void getAdd() {
        try {
            System.out.println("try");
            System.exit(0);

        } catch (final Exception e) {
        	 System.out.println("catch");
            e.printStackTrace();
        } finally {
            System.out.println("final");
        }
    }
}
