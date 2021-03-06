package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationWays implements Cloneable, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String name;

    public ObjectCreationWays() {

    }

    public ObjectCreationWays(final String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(final String args[]) throws IOException, ClassNotFoundException, InstantiationException,
            IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, SecurityException,
            IllegalArgumentException, InvocationTargetException {

        try {
            final ObjectCreationWays d = new ObjectCreationWays("GeeksForGeeks");
            final FileOutputStream f = new FileOutputStream(
                    "C:\\AGS_PROJECTS\\ORBIT_PROJECT\\ORBIT_WORKSPACE\\Java_practice\\src\\resources\\test.txt");
            final ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(d);
            oos.close();
            f.close();
        } catch (final Exception e) {

        }

        final ObjectCreationWays obj1 = new ObjectCreationWays();
        System.out.println("new ob1=" + obj1.hashCode());

        final Class cls = Class.forName("com.test.ObjectCreationWays");// must be package name
        final ObjectCreationWays obj2 = (ObjectCreationWays) cls.newInstance();
        System.out.println("class.forname obj2=" + obj2.hashCode());
        final ObjectCreationWays obj3 = (ObjectCreationWays) obj1.clone();
        System.out.println("clone obj3=" + obj3.hashCode());

        final FileInputStream f = new FileInputStream(
                "C:\\AGS_PROJECTS\\ORBIT_PROJECT\\ORBIT_WORKSPACE\\Java_practice\\src\\resources\\test.txt");
        final ObjectInputStream oos = new ObjectInputStream(f);
        final ObjectCreationWays obj4 = (ObjectCreationWays) oos.readObject();
        System.out.println("deserilize obj4=" + obj4.hashCode());
        final Constructor<ObjectCreationWays> constructor = ObjectCreationWays.class.getDeclaredConstructor();
        final ObjectCreationWays obj5 = constructor.newInstance();
        System.out.println("reflection obj5=" + obj5.hashCode());
    }

}
