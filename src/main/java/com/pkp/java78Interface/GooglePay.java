package com.pkp.java78Interface;

public class GooglePay implements Payment {

    @Override
    public void doTransaction() {
        System.out.println("GPay transaction");
    }


    public static void main(String[] args) {
        Payment paymentGPay =new GooglePay();
        paymentGPay.doTransaction();
        paymentGPay.addCoupon();

        Payment paymentPaytm = new Paytm();
        paymentPaytm.doTransaction();
        paymentPaytm.addCoupon();

        Payment paymentPhonePe = new PhonePe();
        paymentPhonePe.doTransaction();
        paymentPhonePe.addCoupon();

        //static method calling without creating instance from Interface.
        Payment.generateTransactionReport();

    }
}
