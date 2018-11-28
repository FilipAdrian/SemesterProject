package com.walle.UI.sample;

import com.walle.controllers.Encryption;
import com.walle.controllers.UserController;
import com.walle.entities.User;
import javafx.application.Application;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginViewController extends Window implements Initializable {


    private void showNextScene(String sceneName) {

        try {
            Parent root = FXMLLoader.load (getClass ( ).getClassLoader ( ).getResource (sceneName));
            Scene scene = new Scene (root);
            Stage stage = new Stage ( );
            stage.setScene (scene);
            stage.setTitle ("Home");
            stage.show ( );
        } catch (Exception e) {

            Logger.getLogger (Main.class.getName ( )).log (Level.SEVERE, null, e);
        }

    }

    public Stage startStage() throws IOException {
        Parent root = FXMLLoader.load (getClass ( ).getClassLoader ( ).getResource ("Login.fxml"));
        Stage stage = new Stage ( );
        stage.setTitle ("Login");
        stage.setScene (new Scene (root, 800, 387));
        stage.show ( );
        return stage;

    }


    @FXML
    protected Button btnLogIn;
    @FXML
    private PasswordField password;
    @FXML
    private TextField login;
    @FXML
    private TextField error;

    public static StringBuilder nameSurname = new StringBuilder (" ");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        error.setOpacity (0);

    }

    public void handleClicks(ActionEvent actionEvent) throws Exception {
        if (actionEvent.getSource ( ) == btnLogIn) {
            UserController userController = new UserController ( );
            String encryption = Encryption.stringToHash (password.getText ( ));
            User user = userController.verifyUser (login.getText ( ), encryption);

            if (user != null) {
                nameSurname.append (user.getSurname ()).append (" ").append (user.getName ());
//                System.out.println (nameSurname);
                error.setOpacity (0);
                showNextScene ("Home.fxml");
                Stage stage = (Stage) btnLogIn.getScene ( ).getWindow ( );
                stage.close ( );
            } else {
                error.setOpacity (1);


            }

        }
    }

}
