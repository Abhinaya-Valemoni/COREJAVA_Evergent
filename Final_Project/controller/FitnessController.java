package com.evergent.fitness.controller;


import com.evergent.fitness.service.FitnessService;

import java.util.Scanner;

public class FitnessController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitnessService service = new FitnessService();

        int choice;
        do {
            System.out.println("----------Fitness Management System----------");
            System.out.println("1. Register a new member");
            System.out.println("2. View all members");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Member ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Member Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Member Gender (M/F): ");
                    String gender = sc.next();
                    System.out.print("Enter Member Weight: ");
                    double weight = sc.nextDouble();
                    System.out.print("Enter Member Height: ");
                    double height = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Member Email: ");
                    String email = sc.nextLine();

                    int result = service.registerMember(id, name, age, gender, weight, height, email);
                    if (result > 0) {
                        System.out.println("Member registered successfully!");
                    } else {
                        System.out.println("Error in registration.");
                    }
                    break;

                case 2:
                    System.out.println("List of All Members:");
                    service.getAllMembers().forEach(member -> {
                        System.out.println("ID: " + member.getMemberId() + ", Name: " + member.getName() + 
                                           ", Age: " + member.getAge() + ", Gender: " + member.getGender() +
                                           ", Weight: " + member.getWeight() + ", Height: " + member.getHeight() + 
                                           ", Email: " + member.getEmail());
                    });
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}

