package spring.simulatingoperationdohs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import spring.simulatingoperationdohs.MainApplication;
import spring.simulatingoperationdohs.modelClass.User;
import spring.simulatingoperationdohs.utility.FileHandler;

public class CreateUserViewController
{
    @javafx.fxml.FXML
    private ToggleGroup statusGroup;
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private TextArea createUserTextArea;
    @javafx.fxml.FXML
    private TextField passwordTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void validateAndCreateUserButton(ActionEvent actionEvent) {
        String userId = userIdTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String name = nameTextField.getText().trim();
        String contact = contactTextField.getText().trim();
        String password = passwordTextField.getText().trim();

        Alert alert = new Alert(Alert.AlertType.ERROR);

        // Validate empty fields
        if (userId.isEmpty() || email.isEmpty() || name.isEmpty() || contact.isEmpty()) {
            alert.setTitle("Error");
            alert.setHeaderText("All fields are required");
            alert.setContentText("Please fill all the fields");
            alert.showAndWait();
            createUserTextArea.setText("All fields are required");
            return;
        }

        // Validate email format
        if (!email.contains("@") || !email.contains(".")) {
            alert.setTitle("Error");
            alert.setHeaderText("Invalid email");
            alert.setContentText("Please enter a valid email address");
            alert.showAndWait();
            createUserTextArea.setText("Invalid email");
            return;
        }

        // Validate contact number length (assuming 11 is correct)
        if (contact.length() != 11) {
            alert.setTitle("Error");
            alert.setHeaderText("Invalid contact number");
            alert.setContentText("Contact number must be 11 digits");
            alert.showAndWait();
            createUserTextArea.setText("Contact number must be 11 digits");
            return;
        }

        // Validate status selection
        Toggle selectedToggle = statusGroup.getSelectedToggle();
        if (selectedToggle == null) {
            alert.setTitle("Error");
            alert.setHeaderText("Status not selected");
            alert.setContentText("Please select a status");
            alert.showAndWait();
            createUserTextArea.setText("Status not selected");
            return;
        }

        RadioButton selectedRadioButton = (RadioButton) selectedToggle;
        String status = selectedRadioButton.getText();

        // Validate user ID length
        if (userId.length() < 4) {
            alert.setTitle("Error");
            alert.setHeaderText("Invalid user id");
            alert.setContentText("User id must be at least 4 characters");
            alert.showAndWait();
            createUserTextArea.setText("User id must be at least 4 characters");
            return;
        }

        // Validate name does not contain numbers
        if (name.matches(".*\\d.*")) {
            alert.setTitle("Error");
            alert.setHeaderText("Invalid name");
            alert.setContentText("Name cannot contain numbers");
            alert.showAndWait();
            createUserTextArea.setText("Name cannot contain numbers");
            return;
        }

        userIdTextField.clear();
        emailTextField.clear();
        nameTextField.clear();
        contactTextField.clear();
        createUserTextArea.clear();
        statusGroup.selectToggle(null);
        passwordTextField.clear();

        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText("User created successfully");
        successAlert.setContentText("User with ID '" + userId + "' created successfully");
        successAlert.showAndWait();

        // Print to terminal
        System.out.println("User created: ID = " + userId + ", Name = " + name + ", Email = " + email + ", Contact = " + contact + ", Status = " + status);
        User user = new User(Integer.parseInt(userId), password, name, email, status);

        FileHandler.writeObjectToFile(user, "users.bin");
    }

    @javafx.fxml.FXML
    public void dashboardButton(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("LayoutView.fxml")
            );
            Scene dashboardScene = new Scene(loader.load());

            Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(dashboardScene);
            stage.setTitle("Dashboard");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }
