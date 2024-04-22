package com.pkp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* Concept - Comparable                 vs             Comparator
* -------------------------------------------------------------------------------
*  Provides Single Sorting Sequence  <------> Provides multiple sorting sequence
*  Sort by id or name or price       <------> Sort by id, name and price
*  Affects Original Class (modified) <------> Doesn't Affect Original Class (Not Modified)
*  compareTo() methods sort          <------> compare() method sort
*  java.lang package                 <------> java.util package
*  Collections.sort(list)            <------> Collections.sort(list, Comparator)
* */

public class StudentSortingComparable implements Comparable<StudentSortingComparable> {

    private int id;
    private String name;

    public StudentSortingComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentSortingComparable student = (StudentSortingComparable) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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
    public int compareTo(StudentSortingComparable s) {
        if (id == s.id) {
            return 0;
        } else if (id > s.id) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<StudentSortingComparable> students = new ArrayList<>();
        StudentSortingComparable s1 = new StudentSortingComparable(101, "Basant");
        StudentSortingComparable s2 = new StudentSortingComparable(109, "Santosh");
        StudentSortingComparable s3 = new StudentSortingComparable(105, "Prakash");
        StudentSortingComparable s4 = new StudentSortingComparable(98, "Ashik");
        StudentSortingComparable s5 = new StudentSortingComparable(101, "Bikash");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        Collections.sort(students,new IdComparator());
        System.out.println(students);

    }


}
