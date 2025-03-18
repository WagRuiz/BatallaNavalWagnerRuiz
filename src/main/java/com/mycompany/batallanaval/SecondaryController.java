/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.batallanaval;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
/**
 * FXML Controller class
 *
 * @author wagne
 */
public class SecondaryController implements Initializable {


    @FXML
    private GridPane grpTable1;
    @FXML
    private Button btnPortaAviones;
    @FXML
    private Button btnDestructor;
    @FXML
    private Button btnSubmarino;
    @FXML
    private Button btnLancha;
    @FXML
    private CheckBox cbxHorizontal;
    @FXML
    private CheckBox cbxVertical;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
