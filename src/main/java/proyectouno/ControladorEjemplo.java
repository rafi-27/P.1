package proyectouno;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;


public class ControladorEjemplo implements Initializable {
    @FXML
    TextField mostrarNumeritos;
    @FXML
    Slider sliderPa;

    @Override

    public void initialize(URL location, ResourceBundle resources) {
        sliderPa.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldTexto, Number newTexto) {
                mostrarNumeritos.setText(String.format("%.0f", newTexto));
            }
        });
        mostrarNumeritos.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldTexto, String newtexto) {
                sliderPa.setValue(Double.parseDouble(newtexto));
            }
        });
    }
}
