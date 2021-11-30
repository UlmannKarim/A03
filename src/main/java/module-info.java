module com.example.a03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.a03 to javafx.fxml;
    exports com.example.a03;
}