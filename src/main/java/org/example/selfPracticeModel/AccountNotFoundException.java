package org.example.selfPracticeModel;
public class AccountNotFoundException extends  RuntimeException{

    private String userName;

//    public AccountNotFoundException(String message) {
//        super(message);
//    }

    public AccountNotFoundException(String message,String userName) {
        super(message);
        this.userName = userName;
        System.out.println(message + "您輸入的帳號為" + userName);
    }

    public AccountNotFoundException(String userName) {
        super("查無此帳號:" + userName + "；請重新輸入");
        this.userName = userName;
    }
}
