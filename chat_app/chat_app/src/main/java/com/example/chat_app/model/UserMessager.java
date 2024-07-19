package com.example.chat_app.model;

public class UserMessager {
    
    @Override
    public String toString() {
        return "UserMessager [message=" + message + "]";
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
