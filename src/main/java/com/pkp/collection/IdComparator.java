package com.pkp.collection;

import java.util.Comparator;

public class IdComparator implements Comparator<StudentSortingComparable> {


    @Override
    public int compare(StudentSortingComparable s1, StudentSortingComparable s2) {
        if (s1.getId() == s2.getId()) {
            return s1.getName().compareTo(s2.getName());
        } else if (s1.getId() > s2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
