/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

/**
 *
 * @author thipe
 */
public class Login {
    private final String userName;
    private final String passWord;
    private final String firstName;
    private final String lastName;

    public Login(String username, String password, String firstName, String lastName) {
        this.userName = username;
        this.passWord = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean loginUser() {
        return userName.equals("kyl_1") && passWord.equals("Ch&&sec@ke99!");
    }

    public String returnLoginStatus() {
        if (loginUser()) {
            return "Welcome " + firstName + ", " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
