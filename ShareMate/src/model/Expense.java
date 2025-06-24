/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
  import java.util.*;

/**
 * Represents an expense with details such as amount, description, date, and approval status.
 * 
 * @author c0546948
 */
public class Expense {

    
    private int expenseID;
    private float amount;
    private String description;
    private Date date;
    private boolean isLocked;
    private boolean isApproved;
    private User createdBy;
    private String filePath;

    /**
     * Constructs a new Expense object with the specified details.
     * 
     * @param expenseID  the unique ID of the expense
     * @param amount     the amount of the expense
     * @param description the description of the expense
     * @param date       the date of the expense
     * @param isLocked   whether the expense is locked or not
     * @param isApproved whether the expense is approved or not
     * @param createdBy  the user who created the expense
     */
    public Expense(int expenseID, float amount, String description, Date date, boolean isLocked, boolean isApproved, User createdBy) {
        this.expenseID = expenseID;
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.isLocked = isLocked;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
    }

    /**
     * Attaches a receipt to this expense from the specified file path.
     * 
     * @param filePath the file path of the receipt
     */
    public void attachReceipt(String filePath) {
        this.filePath = filePath;
        System.out.println("Receipt attached from: " + filePath);
    }

    /**
     * Marks this expense as approved.
     */
    public void markAsApproved() {
        this.isApproved = true;
        System.out.println("Expense marked as approved.");
    }

    /**
     * Marks this expense as locked.
     */
    public void markAsLocked() {
        this.isLocked = true;
        System.out.println("Expense marked as locked.");
    }

    // Getters and setters can be added here
}