package spring.simulatingoperationdohs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import spring.simulatingoperationdohs.MainApplication;
import spring.simulatingoperationdohs.modelClass.User;

public class LayoutViewController
{
    @javafx.fxml.FXML
    private Menu adminMenu;
    @javafx.fxml.FXML
    private BorderPane layoutBorderPane;
    @javafx.fxml.FXML
    private Menu tenantMenu;
    @javafx.fxml.FXML
    private Menu userNameMenu;


    @javafx.fxml.FXML
    public void initialize() {

    }
    @javafx.fxml.FXML
    public void payRentOnlineOnAction(ActionEvent actionEvent) {

    }
    @javafx.fxml.FXML
    public void accessCommunityFeaturesOnAction(ActionEvent actionEvent) {
    }
    @javafx.fxml.FXML
    public void financialReportsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestLeaseExtensionOrTerminationOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void communityAnnouncementsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("CommunityAnnouncementView.fxml")
            );
            Scene communityAnnouncement = new Scene(loader.load());

            Stage stage = (Stage) layoutBorderPane.getScene().getWindow();
            stage.setScene(communityAnnouncement);
            stage.setTitle("Community Announcement");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @javafx.fxml.FXML
    public void complaintsAndFeedbackOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("ComplaintsFeedbackView.fxml")
            );
            Scene complaintsFeedbackRequest = new Scene(loader.load());

            Stage stage = (Stage) layoutBorderPane.getScene().getWindow();
            stage.setScene(complaintsFeedbackRequest);
            stage.setTitle("Complaints and Feedback");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @javafx.fxml.FXML
    public void submitMaintenanceRequestOnAction(ActionEvent actionEvent) {

    }
    @javafx.fxml.FXML
    public void securityReportsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("SecurityReportsView.fxml")
            );
            Scene SecurityReports = new Scene(loader.load());

            Stage stage = (Stage) layoutBorderPane.getScene().getWindow();
            stage.setScene(SecurityReports);
            stage.setTitle("Security Reports");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @javafx.fxml.FXML
    public void visitorLogsOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("visitorLogsView.fxml")
            );
            Scene visitorLogs = new Scene(loader.load());

            Stage stage = (Stage) layoutBorderPane.getScene().getWindow();
            stage.setScene(visitorLogs);
            stage.setTitle("Visitor Logs");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @javafx.fxml.FXML
    public void trackPaymentAndRentalHistoryOnAction(ActionEvent actionEvent) {
    }
    @javafx.fxml.FXML
    public void userManagementOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("UserManagementView.fxml")
            );
            Scene userManagement = new Scene(loader.load());


            Stage stage = (Stage) layoutBorderPane.getScene().getWindow();
            stage.setScene(userManagement);
            stage.setTitle("User Management");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @javafx.fxml.FXML
    public void propertyListingOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("PropertyListingView.fxml")
            );
            Scene propertyListing = new Scene(loader.load());


            Stage stage = (Stage) layoutBorderPane.getScene().getWindow();
            stage.setScene(propertyListing);
            stage.setTitle("Property Listing");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void rateAndReviewServiceProvidersOnAction(ActionEvent actionEvent) {
    }
    @javafx.fxml.FXML
    public void maintenanceRequestOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("MaintenanceRequestsView.fxml")
            );
            Scene MaintenanceRequests = new Scene(loader.load());

            // Get the stage from any node in the current scene
            Stage stage = (Stage) layoutBorderPane.getScene().getWindow();
            stage.setScene(MaintenanceRequests);
            stage.setTitle("Maintenance Requests");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Action for "Logout and Secure Accounts" button
    @javafx.fxml.FXML
    public void logoutAndSecureAccountsOnAction(ActionEvent actionEvent) {
    }
    @javafx.fxml.FXML
    public void signOutOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("LoginView.fxml")
            );
            Scene loginScene = new Scene(loader.load());

            // Get the stage from any node in the current scene
            Stage stage = (Stage) layoutBorderPane.getScene().getWindow();
            stage.setScene(loginScene);
            stage.setTitle("Login");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @javafx.fxml.FXML
    public void setCurrentUser(User user) {
    }



    @javafx.fxml.FXML
    public void createUserOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    MainApplication.class.getResource("CreateUserView.fxml")
            );
            Scene createUserScene = new Scene(loader.load());

            Stage stage = (Stage) layoutBorderPane.getScene().getWindow();
            stage.setScene(createUserScene);
            stage.setTitle("Create User");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
