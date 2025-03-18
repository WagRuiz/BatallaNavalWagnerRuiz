/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.batallanaval;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author wagne
 */
public class PrimaryController implements Initializable {


    @FXML
    private ImageView imgPrincipal;
    @FXML
    private ImageView btnJugar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary"); // Cambia la pantalla a "secondary.fxml"
    }
    
}
