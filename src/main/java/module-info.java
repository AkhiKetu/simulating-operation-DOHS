module spring.simulatingoperationdohs {
    requires javafx.controls;
    requires javafx.fxml;


    opens spring.simulatingoperationdohs to javafx.fxml;
    exports spring.simulatingoperationdohs;
    exports spring.simulatingoperationdohs.controllers;
    opens spring.simulatingoperationdohs.controllers to javafx.fxml;
}