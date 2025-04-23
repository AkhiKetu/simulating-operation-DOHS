package spring.simulatingoperationdohs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import spring.simulatingoperationdohs.MainApplication;
import spring.simulatingoperationdohs.modelClass.ServiceRequest;

public class MaintenanceRequestsViewController
{
    @javafx.fxml.FXML
    private TableView<ServiceRequest> serviceRequestTable;
    @javafx.fxml.FXML
    private TableColumn<ServiceRequest, String>statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ServiceRequest, Integer> requestIdTableColumn;
    @javafx.fxml.FXML
    private TextArea notesTextField;
    @javafx.fxml.FXML
    private TableColumn<ServiceRequest,String> issueTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ServiceRequest,String> locationTableColumn;
    @javafx.fxml.FXML
    private TextField urgencyTextField;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TextField submittedAtTextField;
    @javafx.fxml.FXML
    private ComboBox<String> updateStatusComboBox;
    @javafx.fxml.FXML
    private TextField issueTypeTextField;

    @javafx.fxml.FXML
    public void initialize() {
        requestIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        issueTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("issueType"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        updateStatusComboBox.getItems().add("Open");
        updateStatusComboBox.getItems().add("In Progress");
        updateStatusComboBox.getItems().add("Resolved");
    }

    @javafx.fxml.FXML
    public void updateStatusButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignButton(ActionEvent actionEvent) {
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