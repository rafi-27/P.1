package proyectouno;

import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class primerPControl {
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

    
    @FXML
    public void initialize() {
        // Asignar controladores de eventos a los sliders
        R.valueProperty().addListener((observable, oldValue, newValue) -> updateLabelColor());
        G.valueProperty().addListener((observable, oldValue, newValue) -> updateLabelColor());
        B.valueProperty().addListener((observable, oldValue, newValue) -> updateLabelColor());
        
    }

    private void updateLabelColor() {
        // Obtener los valores de los sliders
        double red = R.getValue();
        double green = G.getValue();
        double blue = B.getValue();

        double red2 = Double.parseDouble(RUno.getText());
        double green2 = Double.parseDouble(GUno.getText());
        double blue2 = Double.parseDouble(BUno.getText());

        R.setValue(red2);
        G.setValue(green2);
        B.setValue(blue2);

        // Crear un nuevo color con los valores de los sliders
        //Color color = Color.rgb((int) red, (int) green, (int) blue);
        Color color = Color.rgb((int) red2, (int) green2, (int) blue2);

        // Actualizar el color del label
        muestraValoresRGB.setTextFill(color);
    }
}