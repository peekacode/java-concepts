package com.pkp.exceptionInheritance;

public class Child extends Parent{

    @Override
    public void f1(){
        System.out.println("Child - public void f1() Override");
    }

    //Concept 2- We cannot override static and private methods.
    //You cannot access this method in child class since it is static

    // Below code can be used without overriding.
    public static void f2() {
        System.out.println("Child - public static void f2()");
    }


    public static void main(String[] args) throws Exception {
        //Non-static method calling by creating a new Instance.
        Parent parent = new Parent();
        parent.f1();

        Child child = new Child();
        child.f1();

        //Concept 3
        //Static method calling without creating a new Instance.
        Parent.f2();
        Child.f2();
    }


}
