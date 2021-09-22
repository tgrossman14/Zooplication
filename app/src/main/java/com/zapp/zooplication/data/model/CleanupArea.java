package com.zapp.zooplication.data.model;

import java.util.List;

public class CleanupArea {

    private String name;
    private List<CleanupTask> tasks;

    public CleanupArea(String name, List<CleanupTask> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CleanupTask> getTasks() {
        return tasks;
    }

    public void addCleanupTask(CleanupTask task){
        this.tasks.add(task);
    }

    public void removeCleanupTask(CleanupTask task){
        this.tasks.remove(task);
    }

    public void setTasks(List<CleanupTask> tasks) {
        this.tasks = tasks;
    }
}
