package com.pkp.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentSortingComparable> {
    @Override
    public int compare(StudentSortingComparable o1, StudentSortingComparable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
