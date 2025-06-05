package org.example.model;

public class User {
    private String name;
    private String email;
    private String cellphone;
    private String emailProvider;

    public String getEmailProvider() {
        return emailProvider;
    }

    public void setEmailProvider(String emailProvider) {
        this.emailProvider = emailProvider.split("@")[1];
    }

    public User(String name, String email, String cellphone) {
        this.name = name;
        this.email = email;
        this.cellphone = cellphone;
    }

    @Override
    public String toString(){
        return String.format("名字：%s, email：%s：, 電話號碼：%s：", name,email,cellphone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
