package org.example.selfPracticeModel;

public class WrongPasswordException extends  RuntimeException{

    public WrongPasswordException(String message) {
        super(message);
    }
}
