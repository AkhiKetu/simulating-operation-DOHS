package spring.simulatingoperationdohs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import spring.simulatingoperationdohs.MainApplication;

public class VisitorLogsViewController
{
    @javafx.fxml.FXML
    private ComboBox visitorTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker dateRangeFromDob;
    @javafx.fxml.FXML
    private DatePicker dateRangeToDob;
    @javafx.fxml.FXML
    private TableView visitorLogTable;

    @javafx.fxml.FXML
    public void initialize() {
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
    public void alertAuthorityButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterLogsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notifyOfficerButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifyEntryButton(ActionEvent actionEvent) {
    }
}