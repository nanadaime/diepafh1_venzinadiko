/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venzina;

import java.util.Timer;
import java.util.TimerTask;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 *
 * @author xristos
 */
public class Timerjava extends Application {
     int fores; 
 
  @Override
  public void start(Stage primaryStage) 
  {
   
    TextField text1=new TextField("0");    
    //Δημιουργία Timer
    Timer timer1 = new Timer();
    //Δημιουργία TimerTask
    TimerTask task1 = new TimerTask()
    {
        public void run()
        {
          fores=Integer.valueOf(text1.getText());
          fores++;
          String foresstring = String.valueOf(fores);
          Platform.runLater(() -> text1.setText(foresstring));
        }
    };    
    
    
  }
}
    

