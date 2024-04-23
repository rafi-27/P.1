module proyectouno {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens proyectouno to javafx.fxml;
    exports proyectouno;
}
