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
public class Expense {
  

    private int expenseID;
    private float amount;
    private String description;
    private Date date;
    private boolean isLocked;
    private boolean isApproved;
    private User createdBy;
    private String filePath;

    public Expense(int expenseID, float amount, String description, Date date, boolean isLocked, boolean isApproved, User createdBy) {
        this.expenseID = expenseID;
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.isLocked = isLocked;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
    }

     public void attachReceipt(String filepath) {
        // Simulate attaching a receipt
        System.out.println("Receipt attached from: " + filePath);
     }

    public void markAsApproved() {
        this.isApproved = true;
        System.out.println("Expense marked as approved.");
    }

    public void markAsLocked() {
        this.isLocked = true;
        System.out.println("Expense marked as locked.");
    }

    
}
