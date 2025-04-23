package spring.simulatingoperationdohs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import spring.simulatingoperationdohs.MainApplication;

public class ComplaintsFeedbackViewController
{
    @javafx.fxml.FXML
    private TextArea detailsTextField;
    @javafx.fxml.FXML
    private ComboBox issueTypeComboBox;
    @javafx.fxml.FXML
    private ChoiceBox urgencyComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitComplaintButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void attachmentsAddButton(ActionEvent actionEvent) {
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