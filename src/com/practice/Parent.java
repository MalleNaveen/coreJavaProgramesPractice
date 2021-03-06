package com.practice;

import java.io.IOException;

public class Parent {

    int a = 0;
    int b=100;

    public Parent() {
        super();
        System.out.println("parent test");
    }

    protected void add() throws IOException {
        final int a = 1;
        System.out.println("parent=" + a);
    }

}
