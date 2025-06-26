
-- Drop the database if it exists (optional, for clean setup)
DROP DATABASE IF EXISTS sharemate;

-- Create the database
CREATE DATABASE sharemate;
USE sharemate;

-- User Table
CREATE TABLE User (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    join_date DATE NOT NULL,
    role ENUM('user', 'admin') DEFAULT 'user'
);

-- SplitMethod Table
CREATE TABLE SplitMethod (
    method_id INT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    parameters TEXT
);

-- Expense Table
CREATE TABLE Expense (
    expense_id INT AUTO_INCREMENT PRIMARY KEY,
    amount FLOAT NOT NULL,
    description VARCHAR(255),
    date DATE NOT NULL,
    is_locked BOOLEAN DEFAULT FALSE,
    is_approved BOOLEAN DEFAULT FALSE,
    created_by INT,
    split_method_id INT,
    FOREIGN KEY (created_by) REFERENCES User(user_id),
    FOREIGN KEY (split_method_id) REFERENCES SplitMethod(method_id)
);

-- Notification Table
CREATE TABLE Notification (
    notification_id INT AUTO_INCREMENT PRIMARY KEY,
    message VARCHAR(255) NOT NULL,
    timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
    is_read BOOLEAN DEFAULT FALSE,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES User(user_id)
);

-- Receipt Table
CREATE TABLE Receipt (
    receipt_id INT AUTO_INCREMENT PRIMARY KEY,
    expense_id INT,
    file_path VARCHAR(255),
    FOREIGN KEY (expense_id) REFERENCES Expense(expense_id)
);

-- Payment Table (optional, for money transfers)
CREATE TABLE Payment (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    sender_id INT,
    receiver_id INT,
    amount FLOAT NOT NULL,
    status VARCHAR(50) DEFAULT 'pending',
    timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES User(user_id),
    FOREIGN KEY (receiver_id) REFERENCES User(user_id)
);

-- Test Insert (optional)
INSERT INTO User (name, email, password_hash, join_date, role)
VALUES ('Oscar', 'oscar@example.com', 'hashedpass123', CURDATE(), 'admin');
