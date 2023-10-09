/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;
import model.Cubo;


/**
 * FXML Controller class
 *
 * @author gomez
 */
public class Fxml_cuboController implements Initializable {

    @FXML
    private Text textMinuto;
    @FXML
    private Text textSegundos;
    
    private int minutos;
    private int segundos;
    private Timeline timeline;
    private Cubo cubo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), this::actualizarContador));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        cubo = new Cubo();
    }    
    
    private void actualizarContador(ActionEvent event) {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        textMinuto.setText(String.format("%02d", minutos));
        textSegundos.setText(String.format("%02d", segundos));
    }
    private void pintarCubo(){
        cubo.getCubo();
        
    }
}
