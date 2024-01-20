package com.lakhan.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class APIException {

    @ExceptionHandler(InValidIdException.class)
    public ResponseEntity<String> getException( InValidIdException ex){
        return  new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Exception.class)
    public  ResponseEntity<String>globalException(Exception ex){
        log.info("Global error ={}",ex);

        return  new ResponseEntity<>("Internal server error",HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
