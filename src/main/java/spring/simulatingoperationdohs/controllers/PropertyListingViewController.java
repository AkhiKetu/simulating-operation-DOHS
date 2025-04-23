package spring.simulatingoperationdohs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import spring.simulatingoperationdohs.MainApplication;
import spring.simulatingoperationdohs.modelClass.Property;

public class PropertyListingViewController
{
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TableColumn<Property, Integer> priceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Property, String> addressTableColumn;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private TableView<Property> priceListingTable;
    @javafx.fxml.FXML
    private TextArea priceListingTextArea;
    @javafx.fxml.FXML
    private TableColumn<Property, String> propertyNameTableColumn;
    @javafx.fxml.FXML
    private TextField propertyNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
        addressTableColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        propertyNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("propertyName"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        //validate the input fields
        String address = addressTextField.getText().trim();
        String propertyName = propertyNameTextField.getText().trim();
        String priceText = priceTextField.getText().trim();
        if (address.isEmpty() || propertyName.isEmpty() || priceText.isEmpty()) {
            priceListingTextArea.setText("Please fill all the fields");
            return;
        }
        //validate the price
        int price;
        try {
            price = Integer.parseInt(priceText);
        } catch (NumberFormatException e) {
            priceListingTextArea.setText("Please enter a valid price");
            return;
        }
        if (price <= 0) {
            priceListingTextArea.setText("Price must be greater than 0");
            return;
        }


        Property property = new Property(address, propertyName, price);

        priceListingTable.getItems().add(property);
        addressTextField.clear();
        propertyNameTextField.clear();
        priceTextField.clear();

        priceListingTextArea.setText("Property added successfully");
        priceListingTable.getItems().clear();
        priceListingTable.getItems().add(property);
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