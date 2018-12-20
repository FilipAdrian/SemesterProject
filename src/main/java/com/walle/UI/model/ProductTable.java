package com.walle.UI.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ProductTable {
    private final SimpleStringProperty rID;
    private final SimpleStringProperty rName;
    private final SimpleIntegerProperty rQuantity;
    private final SimpleDoubleProperty rPrice;
    private final SimpleDoubleProperty rCost;
    private final SimpleStringProperty rManufacture;
    private final SimpleStringProperty rWarehouse;

    public ProductTable (String sID, String sName, Integer sQuantity, Double sPrice, Double sCost, String sManufacture, String sWarehouse){
        this.rID = new SimpleStringProperty(sID);
        this.rName = new SimpleStringProperty (sName);
        this.rQuantity= new SimpleIntegerProperty (sQuantity);
        this.rPrice = new SimpleDoubleProperty (sPrice);
        this.rCost = new SimpleDoubleProperty (sCost);
        this.rManufacture = new SimpleStringrProperty (sManufacture);
        this.rWarehouse = new SimpleStringProperty (sWarehouse);
    }

    public void setrID (String rID)  { this.rID.set (rID); }
    public void setrName (String rName) {this.rName.set (rName);}
    public void setrQuantity (Integer rQuantity) {this.rQuantity.set (rQuantity);}
    public void setrPrice (Double rPrice) {this.rPrice.set (rPrice);}
    public void setrCost (Double rCost) {this.rCost.set (rCost);}
    public void setrManufacture (String rManufacture) {this.rManufacture.set (rManufacture);}
    public void setrWarehouse (Integer rWarehouse) {this.rWarehouse.set (rWarehouse);}

    public String getrID() {
        return rID.get ( );
    }

    public SimpleStringProperty rIDProperty() {
        return rID;
    }

    public String getrName() {
        return rName.get ( );
    }

    public SimpleStringProperty rNameProperty() { return rName; }

    public Integer getrQuantity() {
        return rQuantity.get ( );
    }

    public SimpleIntegerProperty rQuantityProperty() {
        return rQuantity;
    }

    public double getrPrice() {
        return rPrice.get ( );
    }

    public SimpleDoubleProperty rPriceProperty() {
        return rPrice;
    }

    public double getrCost() {
        return rCost.get ( );
    }

    public SimpleDoubleProperty rCostProperty() {
        return rCost;
    }

    public String getrManufacture() {
        return rManufacture.get ( );
    }

    public SimpleStringProperty rManufactureProperty() {
        return rManufacture;
    }

    public String getrWarehouse() {
        return rWarehouse.get ( );
    }

    public SimpleStringProperty rWarehouseProperty() {
        return rWarehouse;
    }
}
