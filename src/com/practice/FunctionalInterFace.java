package com.practice;
@FunctionalInterface
public interface FunctionalInterFace {
void test(int a, int b);
//void test4(int a, int b); one abstract is mandatory
default void test3(){
	System.out.println("test");
}
default void test34(){
	System.out.println("test5");
}
	
}
