package com.walle.UI.sample;

import com.walle.UI.model.ProductTable;
import com.walle.UI.model.UserTable;
import com.walle.entities.Product;
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
public class ProductController implements Initializable  {

    //Define Table
    @FXML
    TableView <ProductTable> tableID;
    @FXML
    TableColumn <Object, Object> iID;
    @FXML
    TableColumn <Object, Object> iName;
    @FXML
    TableColumn <Object, Object> iQuantity;
    @FXML
    TableColumn <Object, Object> iPrice;
    @FXML
    TableColumn <Object, Object> iCost;
    @FXML
    TableColumn <Object, Object> iManufacture;
    @FXML
    TableColumn <Object, Object> iWarehouse;
    @FXML
    public Pane pnStaff;

    public Integer flag = 0;
    private com.walle.controllers.ProductController productController;
    private List <Product> products;
    private ObservableList <ProductTable> data;


    private ObservableList <ProductTable> insertData() {
        ObservableList <ProductTable> data = FXCollections.observableArrayList ( );

        for (int i = 0; i < products.size ( ); i++) {

            data.add (new ProductTable (products.get (i).getId ( ), products.get (i).getName ( ), products.get (i).getQuantity ( ), products.get (i).getPrice ( ),
                    products.get (i).getCost ( ), products.get (i).getManufacture ( ), products.get (i).getWarehouse ( )));
        }
        return data;
    }

    public void initialize(URL location, ResourceBundle resources) {
        iID.setCellValueFactory (new PropertyValueFactory <> ("rID"));
        iName.setCellValueFactory (new PropertyValueFactory <> ("rName"));
        iQuantity.setCellValueFactory (new PropertyValueFactory <> ("rQuantity"));
        iPrice.setCellValueFactory (new PropertyValueFactory <> ("rPrice"));
        iCost.setCellValueFactory (new PropertyValueFactory <> ("rCost"));
        iManufacture.setCellValueFactory (new PropertyValueFactory <> ("rManufacture"));
        iWarehouse.setCellValueFactory (new PropertyValueFactory <> ("rWarehouse"));

         productController= new com.walle.controllers.ProductController ();
        try {
            products = productController.displayProducts ( );
        } catch (Exception e) {
            System.out.println (e.getMessage ( ));
        }

            data = insertData ( );
        tableID.setItems (data);
    }

    public Pane loadProduct(AnchorPane home,Pane pnlProducts) throws IOException{
        AnchorPane pane = FXMLLoader.load (getClass ( ).getClassLoader ( ).getResource ("product.fxml"));
        pane.prefHeightProperty ( ).bind (home.heightProperty ( ));
        pane.prefWidthProperty ( ).bind (home.widthProperty ( ));
        pnlProducts.getChildren ( ).setAll (pane);
        return  pnlProducts;
    }
}
