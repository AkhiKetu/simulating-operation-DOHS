package spring.simulatingoperationdohs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import spring.simulatingoperationdohs.MainApplication;
import spring.simulatingoperationdohs.modelClass.IncidentReport;

public class SecurityReportsViewController
{
    @javafx.fxml.FXML
    private TableView<IncidentReport> reportTable;
    @javafx.fxml.FXML
    private TableColumn<IncidentReport,String> statusTableColumn;
    @javafx.fxml.FXML
    private TextField incidentTypeField;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TableColumn<IncidentReport, String> locationTableColumn;
    @javafx.fxml.FXML
    private TableColumn<IncidentReport,Integer> reportIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<IncidentReport,String> typeTableColumn;
    @javafx.fxml.FXML
    private TextField timeTextField;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextField;

    @javafx.fxml.FXML
    public void initialize() {
        reportIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("incidentType"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        //setting the status combo box
        statusComboBox.getItems().add("Open");
        statusComboBox.getItems().add("In Progress");
        statusComboBox.getItems().add("Resolved");
    }

    @javafx.fxml.FXML
    public void handleResolve(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void updateStatusButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleEscalate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleVerify(ActionEvent actionEvent) {
    }
}