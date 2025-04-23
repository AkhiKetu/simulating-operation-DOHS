package spring.simulatingoperationdohs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import spring.simulatingoperationdohs.MainApplication;
import spring.simulatingoperationdohs.modelClass.User;

public class UserManagementViewController
{
    @javafx.fxml.FXML
    private TableColumn<User, String> statusTableColumn;
    @javafx.fxml.FXML
    private TextArea userManagementTextArea;
    @javafx.fxml.FXML
    private TableColumn<User, String> emailTableColumn;
    @javafx.fxml.FXML
    private TableColumn<User, String> nameTableColumn;
    @javafx.fxml.FXML
    private TextField conatactEditTextField;
    @javafx.fxml.FXML
    private ToggleGroup statusGroup;
    @javafx.fxml.FXML
    private TableView<User> userManagementTableView;
    @javafx.fxml.FXML
    private TextField nameEditTextField;
    @javafx.fxml.FXML
    private TableColumn<User, Integer> userIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<User,Integer> contactTableColumn;
    @javafx.fxml.FXML
    private TextField searchIdTextField;


    @javafx.fxml.FXML
    public void initialize() {
        userIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        contactTableColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveChangesButtonOnAction(ActionEvent actionEvent) {
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