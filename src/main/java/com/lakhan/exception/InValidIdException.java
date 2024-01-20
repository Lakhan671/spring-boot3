package com.lakhan.exception;

public class InValidIdException extends  RuntimeException {
    public InValidIdException(String invalid){
        super(invalid);
    }
}
