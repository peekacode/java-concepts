package com.pkp.exception;

import java.io.*;

public class RunTimeCompileTimeException {

    //Concept
    // Object -> Throwable ->
    //  -> 1) Error (Unchecked-CTL) -> OutOfMemory(CTL3), StackOverFlowError(CTL4)
    //  -> 2) Exception (Checked-like SERRC)
    //          -> a) RunTime(Unchecked)
    //                -> NullPointer, IndexOutofBounds, Arithmetic, Illegal Argument
    //          -> b) Other Exceptions (Checked/Compile Time)
    //                -> IOException, ClassNotFoundException, FileNotFound, SQL

    public static void main(String[] args) {

        File file=new File("C:\\Users\\basan\\Onerive\\Desktop\\jasypt-cmd");

        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            while(br.readLine()!=null){
                System.out.println(br.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
