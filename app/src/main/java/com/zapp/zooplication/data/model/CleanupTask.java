package com.zapp.zooplication.data.model;

import java.util.List;

public class CleanupTask {

    private String taskDescription;
    private boolean complete;
    private CleanupArea area;
    private List<User> claimedBy;

    public CleanupTask(String taskDescription, boolean complete, CleanupArea area) {
        this.taskDescription = taskDescription;
        this.complete = complete;
        this.area = area;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public CleanupArea getArea() {
        return area;
    }

    public void setArea(CleanupArea area) {
        this.area = area;
    }

    public List<User> getClaimedBy() {
        return claimedBy;
    }

    public void addClaimedBy(User user){
        this.claimedBy.add(user);
    }

    public void removeClaimedBy(User user){
        this.claimedBy.remove(user);
    }

    public void setClaimedBy(List<User> claimedBy) {
        this.claimedBy = claimedBy;
    }
}
