package Week3;

import jdk.jshell.Snippet;

import javax.net.ssl.SSLEngineResult;
import java.io.ObjectInputFilter;

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status status;
    public TaskItem(int id, String desc, Status status)
    {
        this.taskId = id;
        this.taskDescription = desc;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
