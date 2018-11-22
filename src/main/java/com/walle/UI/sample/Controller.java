package com.walle.UI.sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{


    @FXML
    private Button btnOverview;
    @FXML
    private Button btnUser;
    @FXML
    private Button btnUsers;
    @FXML
    private Button btnProducts;
    @FXML
    private Button btnManufactures;
    @FXML
    private Button btnWarehouses;
    @FXML
    private Button btnSales;
    @FXML
    private Button btnPurchases;
    @FXML
    private Button btnStatistics;
    @FXML
    private Button btnSettings;
    @FXML
    protected Button btnLogOut;

    @FXML
    private Pane pnlOverview;
    @FXML
    private Pane pnlUser;
    @FXML
    private Pane pnlUsers;
    @FXML
    private Pane pnlProducts;
    @FXML
    private Pane pnlManufactures;
    @FXML
    private Pane pnlWarehouses;
    @FXML
    private Pane pnlSales;
    @FXML
    private Pane pnlPurchases;
    @FXML
    private Pane pnlStatistics;
    @FXML
    private Pane pnlSettings;
    @FXML
    private Label nameSurname;
    @FXML
    private AnchorPane home;


    ProductController productController = new ProductController ( );
    UserController userController = new UserController ( );


    public void handleClicks(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource ( ) == btnOverview) {
//            pnlOverview.setStyle ("-fx-background-color : #61530A");
            pnlOverview.toFront ( );
        }

        if (actionEvent.getSource ( ) == btnUser) {

            if (userController.flag == 0) {
                try {
                    userController.pnUser = userController.loadUser (home, pnlUser);
                    userController.flag = 1;
                } catch (Exception e) {
                    System.out.println (e.getMessage ( ));
                }
            } else pnlUser = userController.pnUser;
            pnlUser.toFront ( );
        }

        if (actionEvent.getSource ( ) == btnUsers) {
//            pnlUsers.setStyle ("-fx-background-color : #53639F");
            pnlUsers.toFront ( );
        }
        if (actionEvent.getSource ( ) == btnProducts) {

            if (productController.flag == 0) {
                try {

                    productController.pnStaff = productController.loadProduct (home, pnlProducts);
                    productController.flag = 1;
                } catch (Exception e) {
                    System.out.println (e.getMessage ( ));
                }
            } else pnlProducts = productController.pnStaff;
            pnlProducts.toFront ( );
        }
        if (actionEvent.getSource ( ) == btnManufactures) {
//            pnlManufactures.setStyle ("-fx-background-color : #464F31");
            pnlManufactures.toFront ( );
        }
        if (actionEvent.getSource ( ) == btnWarehouses) {
//            pnlWarehouses.setStyle ("-fx-background-color : #429F31");
            pnlWarehouses.toFront ( );
        }
        if (actionEvent.getSource ( ) == btnSales) {
//            pnlSales.setStyle ("-fx-background-color : #164F71");
            pnlSales.toFront ( );
        }
        if (actionEvent.getSource ( ) == btnPurchases) {
//            pnlPurchases.setStyle ("-fx-background-color : #604F31");
            pnlPurchases.toFront ( );
        }
        if (actionEvent.getSource ( ) == btnStatistics) {
//            pnlStatistics.setStyle ("-fx-background-color : #224F31");
            pnlStatistics.toFront ( );
        }
        if (actionEvent.getSource ( ) == btnSettings) {
//            pnlSettings.setStyle ("-fx-background-color : #894F31");
            pnlSettings.toFront ( );
        }
        if (actionEvent.getSource ( ) == btnLogOut) {
            Stage stage = (Stage) btnManufactures.getScene ( ).getWindow ( );
            stage.close ( );
            ControllerLogin controllerLogin = new ControllerLogin ( );
            controllerLogin.startStage ( );
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameSurname.setText (String.valueOf (ControllerLogin.nameSurname));
        try{
            UserController userController = new UserController ();
            userController.initialize (location,resources);


        }
        catch (Exception e){
            e.getLocalizedMessage ();
        }

    }
}

