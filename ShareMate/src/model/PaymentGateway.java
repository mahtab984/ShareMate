/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;

/**
 *Represents a payment gateway for processing transactions between users.
 * @author c0546948
 */
public class PaymentGateway {
    

    /**
     * Constructs a new PaymentGateway object.
     */
    public PaymentGateway() { }

    /**
     * Processes a payment from the specified sender to the receiver.
     * 
     * @param sender  the user sending the payment
     * @param receiver the user receiving the payment
     * @param amount  the amount of the payment
     */
    public void processPayment(User sender, User receiver, double amount) {
        System.out.println("Processing payment of $" + amount + " from " + sender.getName() + " to " + receiver.getName());
    }

    /**
     * Verifies a transaction with the specified ID.
     * 
     * @param transactionID the ID of the transaction to verify
     * @return true if the transaction is verified, false otherwise
     */
    public boolean verifyTransaction(String transactionID) {
        System.out.println("Verifying transaction: " + transactionID);
        return true;
    }

    /**
     * Sends a receipt to the specified user.
     * 
     * @param user the user to send the receipt to
     */
    public void sendReceipt(User user) {
        System.out.println("Receipt sent to: " + user.getName());
    }
}
    

