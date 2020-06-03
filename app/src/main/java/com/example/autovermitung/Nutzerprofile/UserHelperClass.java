package com.example.autovermitung.Nutzerprofile;

public class UserHelperClass {
    String name;
    String username;
    String email;
    String phonNo;
    String password;

    public UserHelperClass(String name,String username, String email,String phonNo,String password){
           this.name=name;
           this.username=username;
           this.email=email;
           this.phonNo=phonNo;
           this.password=password;
    }
    public UserHelperClass(){
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonNo(String phonNo) {
        this.phonNo = phonNo;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonNo() {
        return phonNo;
    }
    public String getPassword() {
        return password;
    }

}



