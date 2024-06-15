package com.pkp.exception;

/*
 *  Exception should be handled in each method using try catch
 *
 * Exception -> NullPointerException
 *           -> RuntimeException
 * 1. Finally will always be executed after catch / exception
 * 2. try/finally and try/catch can be coded  else it will not be compiled.
 * 3. Either use try/catch to handle exception or use throws for that particular method
 * 4. Exception hierarchy ->
 *    class Error extends Throwable // Unchecked Exception (StackOverflow, Out of Memory)
 *    class Exception extends Throwable //Handled by programmer or Checked Exception
 *
 *    class InterruptedException extends Exception  // Checked Exception (try/catch or throws)
 *    class RuntimeException extends Exception
 *
 *    class NullPointerException extends RuntimeException
 *
 * */


import java.util.Scanner;

public class ExceptionConcept {
    public static void main(String[] args) {
        System.out.println("Main Started");
        method1();
        method2();
        finallyMethod();
        try {
            throwsMethod();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        throwsMethod2();
        System.out.println("Main Ended");
    }

    private static void method1() {
        System.out.println("Method Started");
        try {
            String str = null;
            str.length();
            System.out.println("Method Ended");
        } catch (NullPointerException ex) {
            System.out.println("NullPointer Exception");
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(" ArrayIndexOutOfBounds Exception");
            ex.printStackTrace();
        }

    }


    private static void method2() {
        System.out.println("Method 2 Started");
        try {
            int[] i = {1, 2};
            int number = i[3];
            System.out.println("Method Ended");
        } catch (NullPointerException ex) {
            System.out.println("NullPointer Exception");
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBounds Exception");
            ex.printStackTrace();
        }
    }

    private static void finallyMethod(){
        Scanner scanner = null;

        try{
            System.out.println("Scanner opens");
            scanner = new Scanner(System.in);
            int [] numbers = {1,2,3,4};

            int number = numbers[5];
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("scanner closed");
            scanner.close();
        }
    }

    // Use Throws to handle Thread method exception
    private static void throwsMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    //Use try catch to handle Thread method exception
    private static void throwsMethod2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}