package org.example.selfPracticeModel;

public class InvalidInputException extends Exception {
    private String message;

    public InvalidInputException(String message){
        super("所輸入的數值非整數，請重新輸入!");
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
