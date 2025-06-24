/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDateTime;
/**
 *represents a notification with a unique ID, message, timestamp, and read status.
 * @author c0546948
 */
public class Notification {

    private int notificationID;
    private String message;
    private LocalDateTime timestamp;
    private boolean isRead;

    /**
     * Constructs a new notification with the specified ID, message, timestamp, and read status.
     * 
     * @param notificationID the unique ID of the notification
     * @param message        the message content of the notification
     * @param timestamp      the timestamp when the notification was created
     * @param isRead         whether the notification has been read or not
     */
    public Notification(int notificationID, String message, LocalDateTime timestamp, boolean isRead) {
        this.notificationID = notificationID;
        this.message = message;
        this.timestamp = timestamp;
        this.isRead = isRead;
    }

    /**
     * Sends this notification to the specified user.
     * 
     * @param user the user to send the notification to
     */
    public void sendTo(User user) {
        System.out.println("Sending notification to: " + user.getName()); 
    }

    /**
     * Marks this notification as read.
     */
    public void markAsRead() {
        this.isRead = true;
        System.out.println("Notification marked as read.");
    }

    /**
     * Checks whether this notification has been read or not.
     * 
     * @return true if the notification has been read, false otherwise
     */
    public boolean isRead() {
        return isRead;
    }

    /**
     * Gets the unique ID of this notification.
     * 
     * @return the notification ID
     */
    public int getNotificationID() {
        return notificationID;
    }

    /**
     * Gets the message content of this notification.
     * 
     * @return the notification message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets the timestamp when this notification was created.
     * 
     * @return the notification timestamp
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
