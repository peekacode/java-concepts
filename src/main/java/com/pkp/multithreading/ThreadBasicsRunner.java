package com.pkp.multithreading;

import org.w3c.dom.ls.LSOutput;

class Task1 extends Thread{


    public void run(){
        //Task 1
        System.out.println("\n Task 1 started");
        for(int i= 101; i<= 199;i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask 1 Done");
    }
}

class Task2 implements Runnable{

    @Override
    public void run(){
        //Task 2
        System.out.println("\n Task 2 started");
        for(int i= 201; i<= 299;i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask 2 Done");
    }
}

public class ThreadBasicsRunner {

    public static void main(String[] args) {

        //Task 1 starts in parallel/concurrent
        System.out.println("Task 1 kicked off");
        Task1 task1 = new Task1();
        task1.start();

        //Task 2 starts in parallel/concurrent
        System.out.println("Task 2 kicked off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        //Task 3
        for(int i= 301; i<= 399;i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask 3 Done");


        System.out.println("\n Main Ends");
    }
}
