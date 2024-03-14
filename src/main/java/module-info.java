module com.example.calculatortwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatortwo to javafx.fxml;
    exports com.example.calculatortwo;
}