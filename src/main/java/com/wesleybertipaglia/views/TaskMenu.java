package com.wesleybertipaglia.views;

import java.util.Scanner;
import com.wesleybertipaglia.controllers.TaskController;

public class TaskMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TaskController taskController = new TaskController();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = scanner.nextLine();
            handleChoice(choice);
        }
    }

    private static void showMenu() {
        System.out.println("\n-------------------------------------\n");
        System.out.println("📟 TASKDAO MENU");
        System.out.println("\n-------------------------------------\n");
        System.out.println("1. List all tasks");
        System.out.println("2. Create a new task");
        System.out.println("3. Update a task");
        System.out.println("4. Delete a task");
        System.out.println("0. Exit");
        System.out.print("\nChoose an option: ");
    }

    private static void handleChoice(String choice) {
        switch (choice) {
            case "1" -> taskController.list();
            case "2" -> taskController.create();
            case "3" -> taskController.update();
            case "4" -> taskController.delete();
            case "0" -> exitProgram();
            default -> System.out.println("\n⚠️ Invalid option. Please try again.");
        }
    }

    private static void exitProgram() {
        System.out.println("\n👋 Exiting... Goodbye!");
        scanner.close();
        System.exit(0);
    }
}
