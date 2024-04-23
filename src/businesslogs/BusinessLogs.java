/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogs;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BusinessLogs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Account Creation and Login");
        System.out.println("Please choose an option:");
        System.out.println("1. Create Account");
        System.out.println("2. Login");
        int option = scanner.nextInt();

        if (option == 1) {
            createAccount(scanner);
        } else if (option == 2) {
            login(scanner);
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }

    public static void createAccount(Scanner scanner) {
        //Account Creation
        System.out.println("Account Creation");
        System.out.print("Enter username (no more than 5 characters and contains underscore): ");
        String username = scanner.next();
        System.out.print("Enter password (at least 8 characters, contains a capital letter, a number, and a special character): ");
        String password = scanner.next();
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();

        // Check if username meets conditions
        if (username.length() > 5 || !username.contains("_")) {
            System.out.println("Username must be no more than 5 characters long and contain an underscore.");
            return;
        }

        // Check if password meets conditions
        if (password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*") || !password.matches(".*[!@#$%^&*()-_=+\\\\|\\[{\\]};:'\",<.>/?].*")) {
            System.out.println("Password must be at least 8 characters long, contain a capital letter, a number, and a special character.");
            return;
        }

        System.out.println(" Welcome its great seeing you.");
    }

    public static void login(Scanner scanner) {
        System.out.println("Login");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        // username and password for demonstration
        String Username = "user";
        String Password = "Password1@";

        // Check if username and password match
        if (username.equals(Username) && password.equals(Password)) {
            // Login successful
            System.out.println("Welcome " + username + ", it is great to see you again.");
        } else {
            // Login unsuccessful
            System.out.println("Username or password incorrect. Please try again.");
        }
    }
    
}
