package proyectouno;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class primerPControl implements Initializable {
    // Contenedores:
    @FXML
    Pane panelPrincipal;
    @FXML
    Pane panelCambiaColores;

    // Sliders y textField
    @FXML
    Slider R;
    @FXML
    Slider G;
    @FXML
    Slider B;

    @FXML
    TextField RUno;
    @FXML
    TextField GUno;
    @FXML
    TextField BUno;

    @FXML
    Label muestraValoresRGB;

    private void cambiamosColor() {
        int rColor=(int)R.getValue();
        int gColor=(int)G.getValue();
        int bColor=(int)B.getValue();

        RUno.setText(String.valueOf(rColor));
        GUno.setText(String.valueOf(gColor));
        BUno.setText(String.valueOf(bColor));

        String hex = String.format("#%02x%02x%02x", rColor, gColor, bColor);
        panelCambiaColores.setStyle("-fx-background-color: " + hex);
        muestraValoresRGB.setText(hex);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        R.valueProperty().addListener((observable, oldValue, newValue) -> cambiamosColor());
        G.valueProperty().addListener((observable, oldValue, newValue) -> cambiamosColor());
        B.valueProperty().addListener((observable, oldValue, newValue) -> cambiamosColor());

        RUno.textProperty().addListener((observable, oldValue, newValue) -> {
            R.setValue(Double.parseDouble(newValue));
        });

        GUno.textProperty().addListener((observable, oldValue, newValue) -> {
            G.setValue(Double.parseDouble(newValue));
        });

        BUno.textProperty().addListener((observable, oldValue, newValue) -> {
            B.setValue(Double.parseDouble(newValue));
        });
    }
}