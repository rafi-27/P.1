module proyectouno {
    requires javafx.controls;
    requires javafx.fxml;

    opens proyectouno to javafx.fxml;
    exports proyectouno;
}
