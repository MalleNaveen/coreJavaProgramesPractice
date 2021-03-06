package com.practice;

public class JavaTest2 {
    int x = 12;

    public void method(int x) {
        x += x;
        System.out.println(x);
    }

    public static void main(final String arg[]) {
        final JavaTest2 t = new JavaTest2();
        t.method(5);
        System.out.println(t.x);

    }

    public static void main(final String[] arg1[]) {
        final JavaTest2 t = new JavaTest2();
        t.method(5);
        System.out.println(t.x);

    }

}
