package com.example.demo.messages;

public class SuccessfulLogin {
    public boolean success;
    public String message;

    public SuccessfulLogin(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
