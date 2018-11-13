package com.walle.UI.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("uiscene2.fxml"));
            Scene scene =new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Wally");
            primaryStage.show();

        } catch (NullPointerException e){
            System.out.println ("Ceva ii null" );
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null, e);
        }



    }


    public static void main(String[] args) {

        launch(args);
    }
}
