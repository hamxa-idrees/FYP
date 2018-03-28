package com.example.bnc.login;

/**
 * Created by HAmza on 14-Mar-18.
 */

public class User {
    private String email,password, name, phone,cnic;
    public User()
    {
    }
    public User(String email, String password, String name, String phone,String cnic) {
        this.email=email;
        this.password=password;
        this.name=name;
        this.phone=phone;
        this.cnic=cnic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
}
