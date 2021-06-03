package com.example.shlominaveproject;

public class User {
    private String username;
    private String email;
    private String pass;
    private String usertype;

    public User(String username, String email, String pass, String usertypename) {
        this.username = username;
        this.email = email;
        this.pass = pass;
        this.usertype = usertypename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsertypename() {
        return usertype;
    }

//    public void setUsertype(String usertypename) {
//        this.usertype = usertypename;
//    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", usertype='" + usertype + '\'' +
                '}';
    }
}
