package com.walle.UI.sample;

import com.walle.UI.model.SalesTable;
import com.walle.UI.model.UserTable;
import com.walle.entities.Sales;
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
public class SalesViewController implements Initializable  {

    @FXML
    TableView <SalesTable> tableID;
    @FXML
    TableColumn <Object, Object> iID;
    @FXML
    TableColumn <Object, Object> iData;
    @FXML
    TableColumn <Object, Object> iProductQuantity;
    @FXML
    TableColumn <Object, Object> iIdClient;
    @FXML
    TableColumn <Object, Object> iIdProduct;
    @FXML
    TableColumn <Object, Object> iIdUser;

    @FXML
    public Pane pnSales;

    public Integer flag = 0;
    private com.walle.controllers.  SalesController salesController;
    private List <Sales> sales;
    private ObservableList <SalesTable> data;


    private ObservableList <SalesTable> insertData() {
        ObservableList <SalesTable> data = FXCollections.observableArrayList ( );

        for (int i = 0; i < sales.size ( ); i++) {

            data.add (new SalesTable (sales.get (i).getId ( ), sales.get (i).getData ( ), sales.get (i).getProductQuantity (),
                    sales.get (i).getClient (),sales.get (i).getProduct( ), sales.get (i).getUser( )));
        }
        return data;
    }

    public void initialize(URL location, ResourceBundle resources) {
        iID.setCellValueFactory (new PropertyValueFactory <> ("rID"));
        iData.setCellValueFactory (new PropertyValueFactory <> ("rData"));
        iProductQuantity.setCellValueFactory (new PropertyValueFactory <> ("rProductQuantity"));
        iIdClient.setCellValueFactory (new PropertyValueFactory <> ("rIdClient"));
        iIdProduct.setCellValueFactory (new PropertyValueFactory <> ("rIdProduct"));
        iIdUser.setCellValueFactory (new PropertyValueFactory <> ("rIdUser"));

        salesController= new com.walle.controllers.SalesController ();
        try {
            sales = salesController.displaySales ( );
        } catch (Exception e) {
            System.out.println (e.getMessage ( ));
        }

        data = insertData ( );
        tableID.setItems (data);
    }

    public Pane loadSales(AnchorPane home,Pane pnlSales) throws IOException{
        AnchorPane pane = FXMLLoader.load (getClass ( ).getClassLoader ( ).getResource ("sales.fxml"));
        pane.prefHeightProperty ( ).bind (home.heightProperty ( ));
        pane.prefWidthProperty ( ).bind (home.widthProperty ( ));
        pnlSales.getChildren ( ).setAll (pane);
        return  pnlSales;
    }
}