package com.自定义异常;

public class RegisterException extends RuntimeException{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
