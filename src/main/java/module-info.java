module spring.simulatingoperationdohs {
    requires javafx.controls;
    requires javafx.fxml;


    opens spring.simulatingoperationdohs to javafx.fxml;
    exports spring.simulatingoperationdohs;
}