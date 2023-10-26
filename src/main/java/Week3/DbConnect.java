package Week3;

import java.sql.*;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private Connection connection = null;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllTasks() throws SQLException {
        PreparedStatement statement = this
                .connection
                .prepareStatement("SELECT * FROM tasks;");
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }

    public void getTaskByStatus(Status status) throws SQLException {

        PreparedStatement statement = this.connection
                .prepareStatement("SELECT * FROM tasks WHERE task_status = ?");
        statement.setString(1, status.toString());
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }

}
