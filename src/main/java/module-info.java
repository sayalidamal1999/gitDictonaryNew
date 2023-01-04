module com.example.dictonarysayali {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dictonarysayali to javafx.fxml;
    exports com.example.dictonarysayali;
}