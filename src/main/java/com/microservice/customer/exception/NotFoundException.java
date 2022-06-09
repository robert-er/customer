package com.microservice.customer.exception;

public class NotFoundException extends Exception {

    public NotFoundException(String message) {
        super(message);
    }
}
