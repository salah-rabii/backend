package com.myecommerce.exception;
public class CommandeException extends RuntimeException {
    public CommandeException(String message) {
        super(message);
    }

    public CommandeException(String message, Throwable cause) {
        super(message, cause);
    }
}