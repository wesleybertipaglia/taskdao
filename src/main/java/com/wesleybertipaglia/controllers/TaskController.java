package com.wesleybertipaglia.controllers;

import java.util.List;
import java.util.Scanner;

import com.wesleybertipaglia.entities.Task;
import com.wesleybertipaglia.services.TaskService;

public class TaskController {
    private TaskService service = new TaskService();
    private Scanner scanner = new Scanner(System.in);

    public void list() {
        List<Task> tasks = service.list();
        if (tasks.isEmpty()) {
            System.out.println("\nNo tasks available!");
        } else {
            System.out.println("\n--- Tasks ---");
            tasks.forEach(task -> System.out.printf("📝 %d - %s [%s]\n", task.getId(), task.getTitle(),
                    task.isCompleted() ? "✅ Completed" : "☑️ Pending"));
        }
    }

    public void create() {
        System.out.println("\n--- Create Task ---");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Description: ");
        String desc = scanner.nextLine();

        service.create(new Task(title, desc, false));
        System.out.println("\n✅ Task created successfully!");
    }

    public void update() {
        System.out.println("\n--- Update Task ---");
        System.out.println("Enter task ID to update: ");
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
        System.out.println("\n✅ Task updated successfully!");
    }

    public void delete() {
        System.out.println("\n--- Delete Task ---");
        System.out.print("Enter task ID to delete: ");
        int id = scanner.nextInt();
        service.delete(id);
        System.out.println("\n✅ Task deleted successfully!");
    }
}
