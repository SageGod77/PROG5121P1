/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.registration;

/**
 *
 * @author thipe
 */
public class Authorization {
    private final String userName;
    private final String passWord;

    public Authorization(String username, String password) {
        this.userName = username;
        this.passWord = password;
    }

    public boolean checkUserName() {
        return userName.contains("_") && userName.length() <= 5;
    }

    public boolean checkPasswordComplexity() {
        return passWord.length() >= 8 && passWord.matches(".*[A-Z].*") && passWord.matches(".*\\d.*") && passWord.matches(".*[@#&!$%*^].*");
    }

    public String registerUser() {
        if (checkUserName() && checkPasswordComplexity()) {
            return "Registration successful!";
        } else if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        }
    }
}