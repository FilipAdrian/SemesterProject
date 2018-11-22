package com.walle.UI.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.List;

public class UserTable {
    private final SimpleIntegerProperty rID;
    private final SimpleStringProperty rName;
    private final SimpleStringProperty rSurname;
    private final SimpleStringProperty rPhone;
    private final SimpleStringProperty rEmail;
    private final SimpleIntegerProperty rCountry;
    private final SimpleStringProperty rAddress;
    private final SimpleIntegerProperty rRole;



    public UserTable(int sID, String sName, String sSurname, String sPhone
            , String sEmail, Integer sCountry, String sAddress, Integer sRole){
        this.rID = new SimpleIntegerProperty(sID);
        this.rName = new SimpleStringProperty(sName);
        this.rSurname = new SimpleStringProperty (sSurname);
        this.rPhone = new SimpleStringProperty (sPhone);
        this.rEmail = new SimpleStringProperty (sEmail);
        this.rCountry = new SimpleIntegerProperty (sCountry);
        this.rAddress = new SimpleStringProperty (sAddress);
        this.rRole = new SimpleIntegerProperty (sRole);

    }

    public void setrID(int rID) {
        this.rID.set (rID);
    }

    public void setrName(String rName) {
        this.rName.set (rName);
    }

    public void setrSurname(String rSurname) {
        this.rSurname.set (rSurname);
    }

    public void setrPhone(String rPhone) {
        this.rPhone.set (rPhone);
    }

    public void setrEmail(String rEmail) {
        this.rEmail.set (rEmail);
    }

    public void setrCountry(int rCountry) {
        this.rCountry.set (rCountry);
    }

    public void setrAddress(String rAddress) {
        this.rAddress.set (rAddress);
    }

    public void setrRole(int rRole) {
        this.rRole.set (rRole);
    }

    public int getrID() {
        return rID.get ( );
    }

    public SimpleIntegerProperty rIDProperty() {
        return rID;
    }

    public String getrName() {
        return rName.get ( );
    }

    public SimpleStringProperty rNameProperty() {
        return rName;
    }

    public String getrSurname() {
        return rSurname.get ( );
    }

    public SimpleStringProperty rSurnameProperty() {
        return rSurname;
    }

    public String getrPhone() {
        return rPhone.get ( );
    }

    public SimpleStringProperty rPhoneProperty() {
        return rPhone;
    }

    public String getrEmail() {
        return rEmail.get ( );
    }

    public SimpleStringProperty rEmailProperty() {
        return rEmail;
    }

    public int getrCountry() {
        return rCountry.get ( );
    }

    public SimpleIntegerProperty rCountryProperty() {
        return rCountry;
    }

    public String getrAddress() {
        return rAddress.get ( );
    }

    public SimpleStringProperty rAddressProperty() {
        return rAddress;
    }

    public int getrRole() {
        return rRole.get ( );
    }

    public SimpleIntegerProperty rRoleProperty() {
        return rRole;
    }
}
