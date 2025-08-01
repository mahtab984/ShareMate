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
import java.util.List;
import model.Expense;


/**
 * Represents a group administrator who has additional privileges to manage group expenses.
 * 
 * @author c0546948
 */
public class GroupAdmin extends User {

    private List<Expense> expenses;
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
     * @param expense the expense template to create a recurring expense from
     */
    public void createRecurringExpense(Expense expense) {
        System.out.println("Recurring expense created: " + expense);
        expenses.add(expense);
    }
  
    /**
     * Locks an expense with the specified ID to prevent further modifications.
     * 
     * @param expenseID the ID of the expense to lock
     */
    public void lockExpense(int expenseID) {
        System.out.println("Expense " + expenseID + " locked");
        for (Expense expense : expenses) {
            if (expense.getExpenseID() == expenseID) {
                expense.markAsLocked();
                System.out.println("Expense " + expenseID + " is now locked.");
                return;
            }
        }
        System.out.println("Expense " + expenseID + " not found.");
    }
     /**
     * Approves an expense with the specified ID.
     * 
     * @param expenseID the ID of the expense to approve
     */
    public void approveExpense(int expenseID) {
        System.out.println("Expense " + expenseID + " approved");
        for (Expense expense : expenses) {
            if (expense.getExpenseID() == expenseID) {
                expense.markAsApproved();
                System.out.println("Expense " + expenseID + " is now approved.");
                return;
            }
        }
        System.out.println("Expense " + expenseID + " not found.");
    }


    /**
     * Retrieves and displays the complete log of expenses within the group,
     * including who paid and how the expenses were split.
     */
    public void viewExpenseLog() {
        System.out.println("Displaying expense log...");
        for (Expense expense : expenses) {
            System.out.println("Expense ID: " + expense.getExpenseID());
            System.out.println("Amount: " + expense.getAmount());
            System.out.println("Description: " + expense.getDescription());
            System.out.println("Date: " + expense.getDate());
            System.out.println("Locked: " + expense.isLocked());
            System.out.println("Approved: " + expense.isApproved());
     
        }
    }

    /**
     * Retrieves and displays the complete log of expenses within the group,
     * including who paid and how the expenses were split, filtered by the given criteria.
     * 
     * @param filterCriteria criteria to filter the expense log (e.g., date range, member)
     */
    public void viewExpenseLog(String filterCriteria) {
        System.out.println("Displaying expense log with filter: " + filterCriteria);
        for (Expense expense : expenses) {
            if (expense.getDescription().contains(filterCriteria)) {
                System.out.println("Expense ID: " + expense.getExpenseID());
                System.out.println("Amount: " + expense.getAmount());
                System.out.println("Description: " + expense.getDescription());
                System.out.println("Date: " + expense.getDate());
                System.out.println("Locked: " + expense.isLocked());
                System.out.println("Approved: " + expense.isApproved());
                
            }
        }
    }

    /**
     * Retrieves the complete log of expenses within the group,
     * including who paid and how the expenses were split.
     * 
     * @return a list or collection of expenses
     */
    public List<Expense> getExpenseLog() {
        return expenses;
    }
}
