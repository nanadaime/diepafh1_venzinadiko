/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venzina;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
/**
 * FXML Controller class
 *
 *
 */
public class LoginController implements Initializable {
    
    @FXML private javafx.scene.control.Button exitBtn;
    @FXML
    private AnchorPane rootPane;
    
    
    @FXML
    private void closeButtonAction(ActionEvent Event){
    System.exit(0);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    private void Είσοδος(ActionEvent event) throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);
     }
    }
    

