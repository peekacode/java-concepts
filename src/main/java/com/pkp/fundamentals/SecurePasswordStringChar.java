package com.pkp.fundamentals;

/*
 Concept - Which is better to store a password to make it secure String or Char []
  1. String is immutable but stored in SCP and not released until garbage collection.
  2. String Password can be found from memory dump as clear text if not encrypted.
  3. char[] print logging can show memory location rather than String.
* */


public class SecurePasswordStringChar {

    public static void main(String[] args) {
        String strPassword = "Unknown";
        char[] charPassword = new char[] {'U','n','k','n','o','w','n'};

        System.out.println("String Password: " + strPassword);
        System.out.println("Char Password: " + charPassword);
    }
}
