package com.wesleybertipaglia.controllers;

import java.util.List;
import java.util.Scanner;

import com.wesleybertipaglia.entities.Task;
import com.wesleybertipaglia.services.TaskService;

public class TaskController {
    private TaskService service = new TaskService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        int opcao;
        do {
            System.out.println("\n--- TASKDAO ---");
            System.out.println("1. List");
            System.out.println("2. Create");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("0. Exit");
            System.out.print("Chose an option: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> list();
                case 2 -> create();
                case 3 -> update();
                case 4 -> delete();
            }

        } while (opcao != 0);
    }

    private void list() {
        List<Task> tasks = service.list();
        tasks.forEach(task -> System.out.printf("%d - %s [%s]\n", task.getId(), task.getTitle(),
                task.isCompleted() ? "✅ Completed" : "☑️ Pending"));
    }

    private void create() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Description: ");
        String desc = scanner.nextLine();

        service.create(new Task(title, desc, false));
    }

    private void update() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("New title: ");
        String title = scanner.nextLine();
        System.out.print("New description: ");
        String desc = scanner.nextLine();
        System.out.print("Completed? (true/false): ");
        boolean done = scanner.nextBoolean();

        Task t = new Task(title, desc, done);
        t.setId(id);
        service.update(t);
    }

    private void delete() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        service.delete(id);
    }
}