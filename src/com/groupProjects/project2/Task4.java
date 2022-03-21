package com.groupProjects.project2;
    /*
    Create Registration Class in which you would have
    variables as email, userName and password that
    have an access scope only within its own class. After
    creating an object of the class user should be able to
    call methods and in each method separately pass
    values to set users email, username and password.
    Requirements:
    A.Valid email consider to be only yahoo
    B.Valid userName and password cannot be empty and
    should be of length larger than 6 characters. Also
    valid password cannot contain userName.
     */

import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        Registration registration=new Registration();
        registration.setEmail("yahoo");
        registration.setUsername("agnieszka");
        registration.setPassword("agnieszka");
        registration.info();

    }
}

class Registration{
   private String email;
   private String username;
   private String password;

    public void setEmail(String email) {
            this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void info(){
        if (email.toLowerCase().contains("yahoo")){
            if(!username.isEmpty()||!password.isEmpty()){
                if (username.length() > 6 && password.length() > 6) {
                    if(password.contains(username)){
                        System.out.println("password cannot contain username");
                    }else{
                        System.out.println("account has benn created");
                    }
                }else{
                    System.out.println("username and password must have at least 6 characters");
                }
            }else{
                System.out.println("username or password cannot be empty");
            }
        }else {
            System.out.println("only yahoo email id valid");

        }
    }
}

