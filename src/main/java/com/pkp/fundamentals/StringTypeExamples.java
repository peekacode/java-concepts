package com.pkp.fundamentals;

/* *
    Concept of String vs StringBuffer vs StringBuilder
    ----------------------------------------------------
    | String        -> Immutable  -> NotThreadSafe -> High Performance
    | StringBuffer  -> Mutable    -> ThreadSafe    -> Moderate Performance
    | StringBuilder -> Mutable    -> NotThreadSafe -> Very High Performance -> E.g. DynamicQuery
 */

public class StringTypeExamples {

    public static void main(String[] args) {
        
        String s1= new String("Java");
        String pkp = s1.concat("PKP");
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Java");
        sb.append("PKP");
        System.out.println(sb);

        StringBuilder sbl = new StringBuilder("Java");
        sbl.append("PKP");
        System.out.println(sbl);
    }
}
