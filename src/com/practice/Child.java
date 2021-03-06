package com.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent implements Cloneable {

	int b=1000;
    @Override
    public void add() throws FileNotFoundException {

        System.out.println("child");
    }

    public static void main(final String args[])
            throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        final Parent p1 = new Parent();
        System.out.println(p1.hashCode());
        Parent p=new Child();
        System.out.println(p.b);
        final Class cls = Class.forName("Parent");
        final Parent p2 = (Parent) cls.newInstance();
        System.out.println(p2.hashCode());
        
    }

}
