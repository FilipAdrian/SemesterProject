package model;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Table {
    private final SimpleIntegerProperty rID;
    private final SimpleStringProperty rName;
    private final SimpleStringProperty rDate;
    private final SimpleIntegerProperty rPrice;

    public Table(int sID,String sName, String sDate, Integer sPrice){
        this.rID = new SimpleIntegerProperty(sID);
        this.rName = new SimpleStringProperty(sName);
        this.rDate = new SimpleStringProperty(sDate);
        this.rPrice = new SimpleIntegerProperty(sPrice);
    }
    // setters and getters
    public Integer getRID() {
        return rID.get();
    }
    public void setRID(Integer v) {
        this.rID.set(v);
    }

    public String getRName() {
        return rName.get();
    }
    public void setRName(String v) {
        this.rName.set(v);
    }
    public String getRDate() {
        return rDate.get();
    }
    public void setRDate(String v) {
        this.rDate.set(v);
    }
    public Integer getRPrice() {
        return rPrice.get();
    }
    public void setRPrice(Integer v) {
        this.rPrice.set(v);
    }

}
