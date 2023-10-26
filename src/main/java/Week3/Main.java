package Week3;

import java.util.*;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
        DbConnect connection = new DbConnect();

        DataStructures dataStructures = new DataStructures();


        Optional<TaskItem> op = dataStructures.getByStatus(Status.TO_DO);
        op.ifPresent(task -> {
            System.out.println(task.getTaskDescription());
        });

        System.out.println("--------");

        List<TaskItem> list = dataStructures.getByStatusV2(Status.TO_DO);
        list.forEach(task -> {
            System.out.println(task.getTaskDescription());
        });

        System.out.println("--------");

        List<TaskItem> newList = dataStructures.idBiggerThanTwo();
        newList.forEach(task -> {
            System.out.println(task.getTaskDescription());
        });

        dataStructures.returnDesc();

        System.out.println("--------");

        connection.getTaskByStatus(Status.CANCELLED);

        System.out.println("--------");

        connection.getAllTasks();

    }
}