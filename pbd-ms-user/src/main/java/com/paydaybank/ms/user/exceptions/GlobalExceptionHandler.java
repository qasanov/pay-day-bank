package com.paydaybank.ms.user.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Component
public class GlobalExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    public ResponseEntity<ApiError> handle(Exception exception) {
        // general exception
        LOG.error("Exception: Unable to process this request. ", exception);
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST.toString(), "Unable to process this request.");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
    }

    @ExceptionHandler(value = {ExisitingEmailException.class})
    public ResponseEntity<ApiError> handle(ExisitingEmailException exception) {
        // general exception
        LOG.error("Exception: Existing email. ", exception);
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST.toString(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
    }

    @ExceptionHandler(value = {WeakPasswordException.class})
    public ResponseEntity<ApiError> handle(WeakPasswordException exception) {
        // general exception
        LOG.error("Exception: Weak password. ", exception);
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST.toString(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
    }

    @ExceptionHandler(value = {BadCredentialsException.class})
    public ResponseEntity<ApiError> handle(BadCredentialsException exception) {
        // general exception
        LOG.error("Exception: Bad credentials ", exception);
        ApiError apiError = new ApiError(HttpStatus.FORBIDDEN, HttpStatus.FORBIDDEN.toString(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(apiError);
    }
}
