package com.practice;

import java.util.*;

public class Fiveton {

    public final static int MAX_INSTANCES = 5;

    private static List<Fiveton> instances = new ArrayList<Fiveton>();


    private Fiveton() { }


    public static Fiveton getInstance() {
        if (instances.size()>=MAX_INSTANCES) throw new RuntimeException("Hey! You've reached the maximum of instances: " + MAX_INSTANCES);
        Fiveton instance = new Fiveton();
        instances.add(instance);
        return instance;
    }

    public static void destroy(Fiveton instance) {
        instances.remove(instance);
    }

}