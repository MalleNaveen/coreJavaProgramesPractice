package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSort {
    private static class Employee {
        public String name;

        public Employee(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
           return name;
        }
    }

    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();

        map.put(1, new MapSort.Employee("x"));
        map.put(2, new MapSort.Employee("a"));
        map.put(3, new MapSort.Employee("f"));
        List<Map.Entry<Integer, Employee>> entryList = new ArrayList<Map.Entry<Integer, Employee>>(map.entrySet());
            Collections.sort(
                    entryList, new Comparator<Map.Entry<Integer, Employee>>() {
                @Override
                public int compare(Map.Entry<Integer, Employee> integerEmployeeEntry,
                                   Map.Entry<Integer, Employee> integerEmployeeEntry2) {
                    return integerEmployeeEntry.getValue().name
                            .compareTo(integerEmployeeEntry2.getValue().name);
                }
            }
        );

        System.out.println(entryList);
    }
}