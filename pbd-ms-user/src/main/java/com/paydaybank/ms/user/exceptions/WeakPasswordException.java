package com.paydaybank.ms.user.exceptions;

public class WeakPasswordException extends RuntimeException {

    public WeakPasswordException(String message) {
        super(message);
    }

}
