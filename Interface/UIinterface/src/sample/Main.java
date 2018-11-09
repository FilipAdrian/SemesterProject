package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {
    private double x, y;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("uiscene2.fxml"));
            Scene scene =new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Wally");
            primaryStage.show();
            //set stage borderless
            primaryStage.initStyle(StageStyle.UNDECORATED);

            //drag it here
            root.setOnMousePressed(event -> {
                x = event.getSceneX();
                y = event.getSceneY();
            });
            root.setOnMouseDragged(event -> {

                primaryStage.setX(event.getScreenX() - x);
                primaryStage.setY(event.getScreenY() - y);

            });
        } catch (Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null, e);
        }



    }


    public static void main(String[] args) {

        launch(args);
    }
}
