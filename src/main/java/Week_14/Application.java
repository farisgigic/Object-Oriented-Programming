package Week_14;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class ListController implements Initializable {

    public TableView<Student> tblStudents;
    public TableColumn<Student, Integer> colId;
    public TableColumn<Student, String> colFirstName;
    public TableColumn<Student, String> colLastName;
    public TableColumn<Student, String> colYear;
    public Button btnSave;
    public TextField searchField;

    ObservableList<Student> students = FXCollections.observableArrayList(
            new Student(1, "Becir", "Isakovic", "1", "1"),
            new Student(2, "Bekir", "Ishakovic", "2", "2")
    );

    static List<User> users = Arrays.asList(
            new User("admin", "admin123"),
            // Add more users as needed
    );

    int selectedIndex;

    @FXML
    void getStudent(MouseEvent event) {
        selectedIndex = tblStudents.getSelectionModel().getSelectedIndex();
    }

    @FXML
    void saveStudent() {
        // Validate duplicate ID
        if (isDuplicateID(selectedIndex, students.get(selectedIndex).getId())) {
            showError("Duplicate ID", "Student with the same ID already exists");
            return;
        }

        // Proceed with saving the student
    }

    private boolean isDuplicateID(int selectedIndex, int id) {
        return students.stream()
                .filter(student -> student.getId() != selectedIndex) // Exclude the current student for edit
                .anyMatch(student -> student.getId() == id);
    }

    static void showError(String title, String message) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle(title);
        error.setHeaderText(message);
        error.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeTable();
        initializeAutoComplete();
    }

    private void initializeTable() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        colLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        colYear.setCellValueFactory(new PropertyValueFactory<>("year"));

        tblStudents.setItems(students);
    }

    private void initializeAutoComplete() {
        TextFields.bindAutoCompletion(searchField, students.stream()
                .map(Student::getFullName)
                .collect(Collectors.toList()));
    }

}

class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) {
        // Your existing code for starting the application
    }

    public static void main(String[] args) {
        launch();
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // getters and setters
}