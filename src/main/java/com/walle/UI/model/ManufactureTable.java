package com.walle.UI.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ManufactureTable {
    private final SimpleIntegerProperty rID;
    private final SimpleStringProperty rName;
    private final SimpleIntegerProperty rCountry;
    private final SimpleStringProperty rAddress;


    public ManufactureTable (Integer sID, String sName, Integer sCountry, String sAddress){
        this.rID = new SimpleIntegerProperty(sID);
        this.rName = new SimpleStringProperty (sName);
        this.rCountry= new SimpleIntegerProperty (sCountry);
        this.rAddress = new SimpleStringProperty (sAddress);
    }

    public void setrID (Integer rID)  { this.rID.set (rID); }
    public void setrName (String rName) {this.rName.set (rName);}
    public void setrCountry (Integer rCountry) {this.rCountry.set (rCountry);}
    public void setrAddress (String rAddress) {this.rAddress.set (rAddress);}


    public Integer getrID() {return rID.get ( );}

    public SimpleIntegerProperty rIDProperty() {return rID;}

    public String getrName() {return rName.get ( );}

    public SimpleStringProperty rNameProperty() { return rName; }

    public Integer getrCountry() {return rCountry.get ( );}

    public SimpleIntegerProperty rCountryProperty() {return rCountry;}

    public String getrAddress() {return rAddress.get ( );}

    public SimpleStringProperty rAddressProperty() {return rAddress;}


}