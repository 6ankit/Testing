package com.example.demo;

public class AgeLessThanEighteenException extends RuntimeException {
    public AgeLessThanEighteenException(String message) {
        super(message);
    }
}
