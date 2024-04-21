package com.pkp.fundamentals;

public class FinalFinallyFinalizeConcept {

//   Concept of KEYWORD final
//   final variables: variable value cannot be changed after initialized. E.g. constants
//   final methods: final method cannot be overridden by a subclass. E.g Class's public API
//   final classes: final cannot be extended by a subclass. E.g. Class which need to be unmodified.
//   Initialization: Final variables must be initialized either at the time of declaration or in the constructor of the class.
//                   This ensures that the value of the variable is set and cannot be changed.
//    Performance: Improves performance, as compiler can optimize code more effectively when it knows that a variable or method cannot be changed.
//    Security: Improve security by preventing malicious code from modifying sensitive data.


    private final int a=10;

    public void m1(){

        System.out.println("private final int a=10; Immutable variable");
        //a=20;//can't reassign final int
        try {
            System.out.println("try block");
        }finally {
            System.out.println("finally block");
            //clean those stream
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called...");
    }

    public static void main(String[] args) {
        FinalFinallyFinalizeConcept demo=new FinalFinallyFinalizeConcept();
        demo.m1();

        //If Object is null garbage collection calls finalize method.
        // Uncomment below code to see
        demo=null;

        System.gc();
    }
}
