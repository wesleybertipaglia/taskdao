package com.wesleybertipaglia.services;

import java.util.List;

import com.wesleybertipaglia.entities.Task;
import com.wesleybertipaglia.repositories.TaskRepository;

public class TaskService {
    private TaskRepository repository = new TaskRepository();

    public List<Task> list() {
        return repository.findAll();
    }

    public void create(Task task) {
        repository.save(task);
    }

    public void update(Task task) {
        repository.update(task);
    }

    public void delete(int id) {
        repository.delete(id);
    }
}