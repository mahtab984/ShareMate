/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

/**
 *
 * @author c0546948
 */
public class User {

    private int userID;
    private String name;
    private String email;
    private String passwordHash;
    private Date joinDate;

    public User(int userID, String name, String email, String passwordHash, Date joinDate) {
        this.userID = userID;
        this.name = name;
        this.passwordHash = passwordHash;
        this.joinDate = joinDate;
    }

    public void addExpence(Expense expense) {
        System.out.println("Expense added: " + expense);
    }

    //add viewExpenseHistory method
    
    
    public void updateProfile(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("profile updated");
    }

    public void receiveNotification (Notification notification){
    System.out.println("Notification: "+ notification );
    }
    
    
}
