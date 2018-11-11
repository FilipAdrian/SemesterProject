package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import model.Table;

public class Controller implements Initializable {
    //Define Table
    @FXML
    TableView<Table> tableID;
    @FXML
    TableColumn<Table, Integer> iID;
    @FXML
    TableColumn<Table, String> iName;
    @FXML
    TableColumn<Table, String> iDate;
    @FXML
    TableColumn<Table, Integer> iPrice;
    //Define Variables
    private int iNumber=1;
    //Create table data
    private final ObservableList<Table> data= FXCollections.observableArrayList(
            new Table(iNumber++, "Name 1","08/11/2018",50),
            new Table(iNumber++, "Name 2", "09/11/2018", 60),
            new Table(iNumber++, "Name 3", "10/11/2018",100)
    );
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        iID.setCellValueFactory(new PropertyValueFactory<>("rID"));
        iName.setCellValueFactory(new PropertyValueFactory<>("rName"));
        iDate.setCellValueFactory(new PropertyValueFactory<>("rDate"));
        iPrice.setCellValueFactory(new PropertyValueFactory<>("rPrice"));
        tableID.setItems(data);
    }


    @FXML
    private Button btnOverview;
    @FXML
    private Button btnStaff;
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
    private Pane pnlStaff;
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




    public void handleClicks(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnOverview) {
            pnlOverview.setStyle("-fx-background-color : #61530A");
            pnlOverview.toFront();
        }
        if (actionEvent.getSource() == btnStaff) {
            pnlStaff.setStyle("-fx-background-color : #1620A1");
            pnlStaff.toFront();
        }
        if (actionEvent.getSource() == btnUsers) {
            pnlUsers.setStyle("-fx-background-color : #53639F");
            pnlUsers.toFront();
        }
        if(actionEvent.getSource()== btnProducts) {
            pnlProducts.setStyle("-fx-background-color : #464F67");
            pnlProducts.toFront();
        }
        if(actionEvent.getSource()== btnManufactures) {
            pnlManufactures.setStyle("-fx-background-color : #464F31");
            pnlManufactures.toFront();
        }
        if(actionEvent.getSource()== btnWarehouses) {
            pnlWarehouses.setStyle("-fx-background-color : #429F31");
            pnlWarehouses.toFront();
        }
        if(actionEvent.getSource()== btnSales) {
            pnlSales.setStyle("-fx-background-color : #164F71");
            pnlSales.toFront();
        } if(actionEvent.getSource()== btnPurchases)
        {
            pnlPurchases.setStyle("-fx-background-color : #604F31");
            pnlPurchases.toFront();
        } if(actionEvent.getSource()== btnStatistics)
        {
            pnlStatistics.setStyle("-fx-background-color : #224F31");
            pnlStatistics.toFront();
        }if(actionEvent.getSource()== btnSettings)
        {
            pnlSettings.setStyle("-fx-background-color : #894F31");
            pnlSettings.toFront();
        }
    }
}
