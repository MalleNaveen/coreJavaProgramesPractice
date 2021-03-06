package com.practice;

import java.util.HashSet;

public class ClassB extends ClassC {
    public static void main(final String args[]) {

        // final ClassC c = new ClassC();
        final ClassB c = new ClassB();
        c.hashCode();
        final HashSet set = new HashSet<>();
        set.add("tt");
    }

    public ClassB() {
        super.getId();

    }

    public void fun() {
        super.getId();
        System.out.println("ClassB");
    }
}
