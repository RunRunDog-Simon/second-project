package org.example.selfPracticeModel;

public class PasswordTooShortException extends  RuntimeException{

    public PasswordTooShortException(String message) {
        super(message);
    }
}
