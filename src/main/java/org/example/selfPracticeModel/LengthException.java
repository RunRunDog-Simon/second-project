package org.example.selfPracticeModel;

public class LengthException extends RuntimeException {
    public LengthException() {
        super("長度限制不符合規範，需小於20個並大於8個的英文字與數字");
    }

    public LengthException(String message){
        super(message);
    }
}
