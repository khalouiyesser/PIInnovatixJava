module com.test.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens Utils to javafx.fxml;
    exports Utils;
    exports entities;
    opens entities to javafx.fxml;
    exports Tests;
    opens Tests to javafx.fxml;
    exports services;
    opens services to javafx.fxml;
    exports Controller;
    opens Controller to javafx.fxml;
}