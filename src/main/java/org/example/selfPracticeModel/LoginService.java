package org.example.selfPracticeModel;
public class LoginService {
    private String userName;
    private String password;

    public LoginService(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password) throws AccountNotFoundException,
            PasswordTooShortException, WrongPasswordException {
       if( !userName.equals(this.userName)){
           throw new AccountNotFoundException(userName);
       } else if( password.length() < 6){
           System.out.println("您輸入的密碼為" + password.length() + "個字元");
           throw new PasswordTooShortException("ERROR 2: 密碼太短，請輸入至少6個字元以上的英數字。");
       } else if(!password.equals(this.password)){
           throw new WrongPasswordException("ERROR 3: 密碼錯誤。");
       }else {

           System.out.println("成功登入，歡迎" + userName);
       }
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
