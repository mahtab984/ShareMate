/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

/**
 * Represents an expense with details such as amount, description, date, and
 * approval status.
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
     * @param expenseID the unique ID of the expense
     * @param amount the amount of the expense
     * @param description the description of the expense
     * @param date the date of the expense
     * @param isLocked whether the expense is locked or not
     * @param isApproved whether the expense is approved or not
     * @param createdBy the user who created the expense
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

    /**
     * Locks an expense to prevent further modifications.
     *
     * @param expense the expense to lock
     */
    public void lockExpense(Expense expense) {
        expense.markAsLocked();
    }

    /**
     * Approves an expense.
     *
     * @param expense the expense to approve
     */
    public void approveExpense(Expense expense) {
        expense.markAsApproved();
    }
    
    /**
     * Gets the unique ID of the expense.
     * 
     * @return the expense ID
     */
    public int getExpenseID() {
        return expenseID;
    }

    /**
     * Sets the unique ID of the expense.
     * 
     * @param expenseID the new expense ID
     */
    public void setExpenseID(int expenseID) {
        this.expenseID = expenseID;
    }

    /**
     * Gets the amount of the expense.
     * 
     * @return the expense amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Sets the amount of the expense.
     * 
     * @param amount the new expense amount
     */
    public void setAmount(float amount) {
        if (!isLocked) {
            this.amount = amount;
        } else {
            System.out.println("Cannot update a locked expense.");
        }
    }

    /**
     * Gets the description of the expense.
     * 
     * @return the expense description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the expense.
     * 
     * @param description the new expense description
     */
    public void setDescription(String description) {
        if (!isLocked) {
            this.description = description;
        } else {
            System.out.println("Cannot update a locked expense.");
        }
    }

    /**
     * Gets the date of the expense.
     * 
     * @return the expense date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date of the expense.
     * 
     * @param date the new expense date
     */
    public void setDate(Date date) {
        if (!isLocked) {
            this.date = date;
        } else {
            System.out.println("Cannot update a locked expense.");
        }
    }

    /**
     * Checks if the expense is locked.
     * 
     * @return true if the expense is locked, false otherwise
     */
    public boolean isLocked() {
        return isLocked;
    }

    /**
     * Checks if the expense is approved.
     * 
     * @return true if the expense is approved, false otherwise
     */
    public boolean isApproved() {
        return isApproved;
    }

    /**
     * Gets the user who created the expense.
     * 
     * @return the user who created the expense
     */
    public User getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the user who created the expense.
     * 
     * @param createdBy the new user who created the expense
     */
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the file path of the receipt.
     * 
     * @return the file path of the receipt
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the file path of the receipt.
     * 
     * @param filePath the new file path of the receipt
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
