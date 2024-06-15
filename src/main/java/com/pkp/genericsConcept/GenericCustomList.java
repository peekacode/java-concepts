package com.pkp.genericsConcept;

import java.util.ArrayList;

public class GenericCustomList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    /* Below example has Generic method return type T
    */
    public T get(int index){
        return list.get(index);
    }

    @Override
    public String toString() {
        return "GenericCustomList{" +
                "list=" + list +
                '}';
    }
}
