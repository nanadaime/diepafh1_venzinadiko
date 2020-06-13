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
    primaryStage.setTitle("Game Example");
    fores=0;
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
    
    MenuBar menuBar1 = new MenuBar();
    Menu menu1 = new Menu("_Timer");
    MenuItem menuItemStart = new MenuItem("_Start");
    MenuItem menuItemStop = new MenuItem("_Stop");
    menu1.getItems().addAll(menuItemStart, menuItemStop);
    menuBar1.getMenus().addAll(menu1);
    
    menuItemStart.setOnAction(e -> {
        timer1.schedule(task1,0,1000);
    });
    menuItemStop.setOnAction(e -> {
        timer1.cancel();
    });
            
    VBox vBox = new VBox(menuBar1,text1);
    Scene scene = new Scene(vBox, 500, 400);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
    

