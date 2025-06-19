/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author c0546948
 */
public class GroupAdmin extends User {
    

    
    
 public GroupAdmin(int userID, String name, String email, String passwordHash, Date joinDate){
 super(userID,name,email,passwordHash,joinDate);
 
 }
 
 public void createRecurringExpense(Expense template){
 System.out.println("recurring expense created"+ template);
 }
 
 public void lockExpense( int expenseID){
 System.out.println("Expense "+ expenseID+ "locked");
 } 
 
 public void approveExpense( int expenseID){
 System.out.println("Expense "+ expenseID+ "approved");
 
 
 } 
 
 //add manageGroupMembers method
 
}
