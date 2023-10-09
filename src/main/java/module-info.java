module com.mycompany.cuborubik {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.cuborubik to javafx.fxml;
    exports com.mycompany.cuborubik;
    
    opens controller to javafx.fxml;
    exports controller;
}
