/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

/**
 * Represents a user with basic attributes and methods for managing expenses.
 * 
 * @author c0546948
 */
public class User {

    private int userID;
    private String name;
    private String email;
    private String passwordHash;
    private Date joinDate;

    /**
     * Constructs a new User object with the specified details.
     * 
     * @param userID      the unique ID of the user
     * @param name        the name of the user
     * @param email       the email address of the user
     * @param passwordHash the hashed password of the user
     * @param joinDate    the date when the user joined
     */
    public User(int userID, String name, String email, String passwordHash, Date joinDate) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.joinDate = joinDate;
    }

    /**
     * Adds a new expense to the user's account.
     * 
     * @param expense the expense to add
     */
    public void addExpense(Expense expense) {
        System.out.println("Expense added: " + expense);
    }

    /**
     * Views the user's expense history.
     */
    public void viewExpenseHistory() {
        // Implementation to view expense history
        System.out.println("Viewing expense history");
    }

    /**
     * Updates the user's profile with the specified name and email.
     * 
     * @param name  the new name of the user
     * @param email the new email address of the user
     */
    public void updateProfile(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("Profile updated");
    }

    /**
     * Receives a notification and prints it to the console.
     * 
     * @param notification the notification to receive
     */
    public void receiveNotification(Notification notification) {
        System.out.println("Notification: " + notification);
    }

    /**
     * Gets the name of the user.
     * 
     * @return the name of the user
     */
    public String getName() {
        return name;
    }
    public String getEmail() {
    return email;
}

public String getPasswordHash() {
    return passwordHash;
}
}