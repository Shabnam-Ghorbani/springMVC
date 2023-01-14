package com.maktab.hospitalmvc.exception;

public class ValidationException extends RuntimeException {
    String message;

    public ValidationException(String message) {
        this.message = message;
    }
}

