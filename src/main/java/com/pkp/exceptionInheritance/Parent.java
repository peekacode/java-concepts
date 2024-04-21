package com.pkp.exceptionInheritance;

public class Parent {

    //Concept 1
    //Inheritance - Concept of Exception in function
    // If Parent has Exception, Child throw exception is optional.
    // If Child has Exception, Parent throw exception is mandatory.

    public void f1() throws Exception {
        System.out.println("Parent - public void f1()");
    }

    public static void f2() {
        System.out.println("Parent - public static void f2()");
    }

    //We cannot override static and private methods.
    //You cannot access this method in child class since it is private
    private void test(){
    }
}
