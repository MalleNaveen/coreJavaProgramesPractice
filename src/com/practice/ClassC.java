package com.practice;

public class ClassC {

    private int id;
    private String name;

    public ClassC() {
        this(1);

        System.out.println("default");
    }

    public ClassC(final int id) {
        this("naveen");
        this.getName();
        this.id = id;
        this.setId(2);
        System.out.println(id);
    }

    public ClassC(final String name) {
        this.name = name;
        System.out.println(name);
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        System.out.println(id);
        this.id = id;
    }

    public String getName() {
        System.out.println("name method");
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
