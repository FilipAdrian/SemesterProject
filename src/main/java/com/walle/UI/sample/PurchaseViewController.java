package com.walle.UI.sample;

import com.walle.UI.model.PurchaseTable;
import com.walle.entities.Purchase;
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

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
public class PurchaseViewController implements Initializable  {

    @FXML
    TableView <PurchaseTable> tableID;
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
    public Pane pnlPurchase;

    public Integer flag = 0;
    private com.walle.controllers.  PurchaseController purchaseController;
    private List <Purchase> purchase;
    private ObservableList <PurchaseTable> data;


    private ObservableList <PurchaseTable> insertData() {
        ObservableList <PurchaseTable> data = FXCollections.observableArrayList ( );

        for (int i = 0; i < purchase.size ( ); i++) {

            data.add (new PurchaseTable (purchase.get (i).getId ( ), purchase.get (i).getData ( ), purchase.get (i).getProductQuantity (),
                    purchase.get (i).getClient( ),purchase.get (i).getProduct( ), purchase.get (i).getUser( )));
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

         purchaseController= new com.walle.controllers.PurchaseController ();
        try {
            purchase = purchaseController.displayPurchases ( );
            System.out.println (purchase );
        } catch (Exception e) {
            System.out.println (e.getMessage ( ));
        }

            data = insertData ( );
        tableID.setItems (data);
    }

    public Pane loadPurchase(AnchorPane home,Pane pnlPurchase) throws IOException{
        AnchorPane pane = FXMLLoader.load (getClass ( ).getClassLoader ( ).getResource ("purchase.fxml"));
        pane.prefHeightProperty ( ).bind (home.heightProperty ( ));
        pane.prefWidthProperty ( ).bind (home.widthProperty ( ));
        pnlPurchase.getChildren ( ).setAll (pane);
        return  pnlPurchase;
    }
}