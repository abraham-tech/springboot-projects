package net.javaguides.transactiondemo.exception;

public class PaymentException extends RuntimeException {
    public PaymentException(String message){
        super(message);
    }
}

