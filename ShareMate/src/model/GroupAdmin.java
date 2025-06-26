/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
/**
 * Represents a group administrator who has additional privileges to manage group expenses.
 * 
 * @author c0546948
 */
public class GroupAdmin extends User {

    /**
     * Constructs a new GroupAdmin object with the specified user details.
     * 
     * @param userID      the unique ID of the group admin
     * @param name        the name of the group admin
     * @param email       the email address of the group admin
     * @param passwordHash the hashed password of the group admin
     * @param joinDate    the date when the group admin joined
     */
    public GroupAdmin(int userID, String name, String email, String passwordHash, Date joinDate) {
        super(userID, name, email, passwordHash, joinDate);
    }

    /**
     * Creates a recurring expense based on the provided template.
     * 
     * @param template the expense template to create a recurring expense from
     */
    public void createRecurringExpense(Expense template) {
        System.out.println("Recurring expense created: " + template);
    }

    /**
     * Locks an expense with the specified ID to prevent further modifications.
     * 
     * @param expenseID the ID of the expense to lock
     */
    public void lockExpense(int expenseID) {
        System.out.println("Expense " + expenseID + " locked");
    }

    /**
     * Approves an expense with the specified ID.
     * 
     * @param expenseID the ID of the expense to approve
     */
    public void approveExpense(int expenseID) {
        System.out.println("Expense " + expenseID + " approved");
    }

 
 //add manageGroupMembers method
 
}
