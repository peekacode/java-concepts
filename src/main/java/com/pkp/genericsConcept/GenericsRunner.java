/*
*  A generic type is a generic class or interface that is parameterized over types
*/
package com.pkp.genericsConcept;
import com.pkp.genericsConcept.GenericCustomList;

public class GenericsRunner {

    public static void main(String[] args) {

        GenericCustomList<String> list = new GenericCustomList<>();
        System.out.println(list);
        list.addElement("Google");
        list.addElement("Yahoo");
        list.removeElement("Google");
        System.out.println(list);

        //generic return type
        String value = list.get(0);
        System.out.println(value);

        GenericCustomList<Integer> list2 = new GenericCustomList<>();
        System.out.println(list2);
        list2.addElement(100);
        list2.addElement(1000);
        list2.removeElement(100);
        System.out.println(list2);

        //generic return type of Integer
        Integer valueInteger = list2.get(0);
        System.out.println(valueInteger);
    }
}