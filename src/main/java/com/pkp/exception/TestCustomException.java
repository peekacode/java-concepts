package com.pkp.exception;

public class TestCustomException {

    //Concept of Throwing Custom Exception
    // 1) Create a class called OrderNotFoundException (extends Exception class)
    // 2) Test the exception in this class by
    // DAO needs to throw custom exception when communicating with DB

    //Concept of Throw vs Throws
    // 1. Throw is explicitly coded in the method.
    // 2. throws is specified as signature of method to specify which exception is thrown.



    public void getOrder(int orderId) throws OrderNotFoundException {
        if(orderId==101){
            throw new OrderNotFoundException("Order not found with id "+orderId);
        }else{
            //do some logic
        }
    }


    public static void main(String[] args) throws OrderNotFoundException {
        TestCustomException test=new TestCustomException();
        test.getOrder(101);
    }
}
