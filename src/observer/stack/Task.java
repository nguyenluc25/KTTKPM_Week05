package observer.stack;


import java.util.ArrayList;
import java.util.List;

public class Task implements Subject {
    private List<Observer> teamMembers = new ArrayList<>();
    private String taskStatus;

    @Override
    public void addObserver(Observer observer) {
        teamMembers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        teamMembers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer member : teamMembers) {
            member.update(taskStatus);
        }
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        notifyObservers();
    }
}
