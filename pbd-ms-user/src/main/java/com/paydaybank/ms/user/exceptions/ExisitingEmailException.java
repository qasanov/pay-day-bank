package com.paydaybank.ms.user.exceptions;

public class ExisitingEmailException extends RuntimeException {

    public ExisitingEmailException(String message) {
        super(message);
    }
}
