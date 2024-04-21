package com.pkp.fundamentals;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



public class HashCodeEqualsConcept {

    private int id;
    private String name;

    public HashCodeEqualsConcept() {
    }

    public HashCodeEqualsConcept(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeEqualsConcept employee = (HashCodeEqualsConcept) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        //Concept of Root Object Class
        // HashCode will create an integer code based on variables.
        // Equals function will check if both Objects are same or not (based on HashCode value checks)

        HashCodeEqualsConcept employee1 = new HashCodeEqualsConcept(101, "Anusha");
        System.out.println(employee1.hashCode());
        HashCodeEqualsConcept employee2 = new HashCodeEqualsConcept(102, "Anusha");
        System.out.println(employee2.hashCode());

        System.out.println("is hashcode() same : " + (employee1.hashCode() == employee2.hashCode()));
        System.out.println("is equals() same : " + (employee1.equals(employee2)));


        Set<HashCodeEqualsConcept> employees=new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        System.out.println(employees);

    }
}
