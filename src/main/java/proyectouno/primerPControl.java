package proyectouno;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class primerPControl implements Initializable{
    //Contenedores:
    @FXML Pane panelPrincipal;
    @FXML Pane panelCambiaColores;

    //Sliders y textField
    @FXML Slider R;
    @FXML Slider G;
    @FXML Slider B;

    @FXML TextField RUno;
    @FXML TextField GUno;
    @FXML TextField BUno;

    @FXML Label muestraValoresRGB;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Color color = new Color(0, 0, 0, 0);
        String enteredByUser = "abcdef";
        panelCambiaColores.setStyle("-fx-background-color: #ffffff");

        String primeHex = Double.toHexString(R.getValue());
        String segundoHex = Double.toHexString(G.getValue());
        String tercerHex = Double.toHexString(B.getValue());

        RUno.setText(primeHex);
        GUno.setText(segundoHex);
        BUno.setText(tercerHex);

        muestraValoresRGB.setText(primeHex+segundoHex+tercerHex);
    }






}