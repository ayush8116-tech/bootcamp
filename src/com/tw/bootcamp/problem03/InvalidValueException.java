package com.tw.bootcamp.problem03;

public class InvalidValueException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Invalid Value";
    }
}
