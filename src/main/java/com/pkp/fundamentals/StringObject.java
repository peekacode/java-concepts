package com.pkp.fundamentals;

public class StringObject {

    public static void main(String[] args) {

        //Concept - String Features and Advantages
        // String is immutable
        // -> Java Runtime saves heap space
        // -> Secure for DB passwords
        // -> Safe for multithreading
        // -> HashCode is cached at time of creation- improves performance.


        //Concept- constant literal "pkp" is stored in SCP(String Constant Pool)
        // SCP can be accessed by intern() method.
        //If same literal is already present it will not create object.
        // So totally we get 2 objects gets created 1. by New keyword 2. by Literal



        //how many object created here
        String s1=new String("pkp");
        //1 object -> new -> heap
        //2 object -> literal -> SCP (String constant pool area)

        String s2="pkp";
        // intern method used to get reference from SCP
        System.out.println(s1.intern());
        System.out.println(s1.intern().hashCode()==s2.hashCode());

        //total object count 2


    }
}
