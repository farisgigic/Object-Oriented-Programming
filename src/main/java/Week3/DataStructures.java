package Week3;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();
    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED),
                new TaskItem(4,"Learn java", Status.TO_DO));
    }

    // TODO create a method to get all objects

    public List<TaskItem> returnAll () {
        return this.tasks;
    }

    // TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status

    public Optional<TaskItem> getByStatus(Status status) {
        return tasks.stream()
                .filter(task -> {
                    return task.getStatus().equals(status);
                }).findFirst();
    }

    public List<TaskItem> getByStatusV2(Status status) {
        List<TaskItem> filteredTasks = tasks.stream()
                .filter(task -> task.getStatus().equals(status))
                .toList();
        return filteredTasks;
    }

    // TODO create a method to find tasks whose id parameter greater than or equal to 2

    public List<TaskItem> idBiggerThanTwo() {
        List<TaskItem> filteredList = tasks.stream()
                .filter(tasks -> tasks.getTaskId() >= 2)
                .toList();
        return filteredList;
    }

    // TODO create a method that will, by using the forEach stream method, print to the console the description of each task

    public void returnDesc() {
        this.tasks.forEach(task -> {
            System.out.println(task.getTaskDescription());
        });
    }
}
