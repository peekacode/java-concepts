package com.pkp.immutable;

/*
  Concept - How to create a Immutable Class?
  Answer - 1. Make the class as 'final'
           2. Declare instance variables as 'final' and 'private'
           3. Only Getter methods. NO Setter methods.
           4. Initialize All variables in constructor
           5. Perform Cloning of Mutable Objects while returning from getter method.
*/

import java.util.*;
import java.util.stream.Collectors;

public final class Employee {

    private final String name;
    private final Date doj;//mutable
    private final List<String> mobile;

    private final Address address;

    public Employee(String name, Date doj, List<String> mobile, Address address) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {

        //clone will protect against Mutable Date Class hence Date cannot be changed in Main
        return (Date) doj.clone();
    }

    public List<String> getMobile() {

        // below is immutable as ArrayList is Immutable.
        return new ArrayList<>(mobile);

        //Throws exception as List cannot be modified
        //return Collections.unmodifiableList(mobile);

        // The below is mutable as List is Mutable
        //return mobile;
    }

    public Address getAddress() {

        //returns Mutable Class
        //return address;

        //returns Immutable Class
        return new Address(address.getCity(),address.getZip());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address=new Address("blr","1012");
        Employee employee=new Employee("Basant",new Date(),
                Arrays.stream(new String[]{"1234","5678"}).collect(Collectors.toList()), address);

        // Try to change the Date (as Date is Mutable)-- To avoid use clone ..see notes above
        employee.getDoj().setDate(11);

        employee.getMobile().add("9010");
        employee.getAddress().setCity("Pune");
        System.out.println(employee);

    }
}
