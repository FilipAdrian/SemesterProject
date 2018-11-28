package com.walle.UI.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class PurchaseTable {
    private final SimpleIntegerProperty rID;
    private final SimpleStringProperty rData;
    private final SimpleIntegerProperty rProductQuantity;
    private final SimpleIntegerProperty rIdClient;
    private final SimpleStringProperty rIdProduct;
    private final SimpleIntegerProperty rIdUser;


    public PurchaseTable (Integer sID, String sData, Integer sProductQuantity, Integer sIdClient, String sIdProduct, Integer sIdUser){
        this.rID = new SimpleIntegerProperty(sID);
        this.rData = new SimpleStringProperty (sData);
        this.rProductQuantity= new SimpleIntegerProperty (sProductQuantity);
        this.rIdClient = new SimpleIntegerProperty (sIdClient);
        this.rIdProduct = new SimpleStringProperty (sIdProduct);
        this.rIdUser = new SimpleIntegerProperty (sIdUser);
    }

    public void setrID (Integer rID)  { this.rID.set (rID); }
    public void setrData (String rData) {this.rData.set (rData);}
    public void setProductQuantity (Integer rProductQuantity) {this.rProductQuantity.set (rProductQuantity);}
    public void setIdClient (Integer rIdClient) {this.rIdClient.set (rIdClient);}
    public void setIdProduct (String rIdProduct) {this.rIdProduct.set (rIdProduct);}
    public void setIdUser (Integer rIdUser) {this.rIdUser.set (rIdUser);}



    public Integer getrID() {return rID.get ( );}
    public SimpleIntegerProperty rIDProperty() {return rID;}

    public String getrData() {return rData.get ( );}
    public SimpleStringProperty rDataProperty() { return rData; }

    public Integer getrProductQuantity() {return rProductQuantity.get ( );}
    public SimpleIntegerProperty rProductQuantityProperty() {return rProductQuantity;}

    public Integer getIdClient() {return rIdClient.get ( );}
    public SimpleIntegerProperty rIdClientProperty() {return rIdClient;}

    public String getrIdProduct() {return rIdProduct.get ( );}
    public SimpleStringProperty rIdProductProperty() {return rIdProduct;}

    public Integer getrIdUser() { return rIdUser.get ( );}
    public SimpleIntegerProperty rIdUserProperty() {return rIdUser;}


}