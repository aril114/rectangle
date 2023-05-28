module com.example.rectangle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rectangle to javafx.fxml;
    exports com.example.rectangle;
}