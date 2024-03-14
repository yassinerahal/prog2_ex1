module at.ac.fhcampuswien.fhmdb {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.jfoenix;

    opens at.ac.fhcampuswien.fhmdb to javafx.fxml;
    exports at.ac.fhcampuswien.fhmdb;
    exports at.ac.fhcampuswien.fhmdb.contoller;
    opens at.ac.fhcampuswien.fhmdb.contoller to javafx.fxml;
    exports at.ac.fhcampuswien.fhmdb.models;
    opens at.ac.fhcampuswien.fhmdb.models to javafx.fxml;
    exports at.ac.fhcampuswien.fhmdb.states;
    opens at.ac.fhcampuswien.fhmdb.states to javafx.fxml;
}