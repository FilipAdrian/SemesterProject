package com.walle.UI.sample;

import com.walle.UI.model.ManufactureTable;
import com.walle.UI.model.UserTable;
import com.walle.entities.Manufacture;
import com.walle.entities.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
public class ManufactureViewController implements Initializable  {

    @FXML
    TableView <ManufactureTable> tableID;
    @FXML
    TableColumn <Object, Object> iID;
    @FXML
    TableColumn <Object, Object> iName;
    @FXML
    TableColumn <Object, Object> iCountry;
    @FXML
    TableColumn <Object, Object> iAddress;
   
    @FXML
    public Pane pnManufacture;

    public Integer flag = 0;
    private com.walle.controllers.ManufactureController manufactureController;
    private List <Manufacture> manufacture;
    private ObservableList <ManufactureTable> data;


    private ObservableList <ManufactureTable> insertData() {
        ObservableList <ManufactureTable> data = FXCollections.observableArrayList ( );

        for (int i = 0; i < manufacture.size ( ); i++) {

            data.add (new ManufactureTable (manufacture.get (i).getId ( ), manufacture.get (i).getName ( ),
                    manufacture.get (i).getCountry ( ), manufacture.get (i).getAddress( )));
        }
        return data;
    }

    public void initialize(URL location, ResourceBundle resources) {
        iID.setCellValueFactory (new PropertyValueFactory <> ("rID"));
        iName.setCellValueFactory (new PropertyValueFactory <> ("rName"));
        iCountry.setCellValueFactory (new PropertyValueFactory <> ("rCountry"));
        iAddress.setCellValueFactory (new PropertyValueFactory <> ("rAddress"));

         manufactureController= new com.walle.controllers.ManufactureController ();
        try {
            manufacture = manufactureController.displayManufacture ();
        } catch (Exception e) {
            System.out.println (e.getMessage ( ));
        }

            data = insertData ( );
        tableID.setItems (data);
    }

    public Pane loadManufacture(AnchorPane home,Pane pnlManufacture) throws IOException{
        AnchorPane pane = FXMLLoader.load (getClass ( ).getClassLoader ( ).getResource ("manufacture.fxml"));
        pane.prefHeightProperty ( ).bind (home.heightProperty ( ));
        pane.prefWidthProperty ( ).bind (home.widthProperty ( ));
        pnlManufacture.getChildren ( ).setAll (pane);
        return  pnlManufacture;
    }
}