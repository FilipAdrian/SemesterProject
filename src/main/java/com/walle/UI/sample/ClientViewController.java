package com.walle.UI.sample;
import com.walle.UI.model.ClientTable;
import com.walle.entities.Client;
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

public class ClientViewController implements Initializable {

    @FXML
    TableView <ClientTable> tableID;
    @FXML
    TableColumn <Object, Object> iID;
    @FXML
    TableColumn <Object, Object> iName;
    @FXML
    TableColumn <Object, Object> iSurname;
    @FXML
    TableColumn <Object, Object> iPhone;
    @FXML
    TableColumn <Object, Object> iEmail;
    @FXML
    TableColumn <Object, Object> iCountry;
    @FXML
    TableColumn <Object, Object> iAddress;
    @FXML
    TableColumn <Object, Object> iType;
    @FXML
    public Pane pnlClient;

    public Integer flag = 0;

    private com.walle.controllers.ClientController clientController;
    private List <Client> clients;
    private ObservableList <ClientTable> data;

    public ClientViewController() {
    }

    private ObservableList <ClientTable> insertData() {
        ObservableList <ClientTable> data = FXCollections.observableArrayList ( );
        System.out.println (clients );

        for (int i = 0; i < clients.size ( ); i++) {

            data.add (new ClientTable (clients.get (i).getId ( ), clients.get (i).getName ( ), clients.get (i).getSurname ( ), clients.get (i).getPhone ( ),
                    clients.get (i).getEmail ( ), clients.get (i).getCountry ( ), clients.get (i).getAddress ( ), clients.get (i).getType ( )));
            System.out.println ( clients.get (i).getType ( ));
        }
        return data;
    }

    @Override

    public void initialize(URL location, ResourceBundle resources) {
        iID.setCellValueFactory (new PropertyValueFactory <> ("rID"));
        iName.setCellValueFactory (new PropertyValueFactory <> ("rName"));
        iSurname.setCellValueFactory (new PropertyValueFactory <> ("rSurname"));
        iPhone.setCellValueFactory (new PropertyValueFactory <> ("rPhone"));
        iEmail.setCellValueFactory (new PropertyValueFactory <> ("rEmail"));
        iCountry.setCellValueFactory (new PropertyValueFactory <> ("rCountry"));
        iAddress.setCellValueFactory (new PropertyValueFactory <> ("rAddress"));
        iType.setCellValueFactory (new PropertyValueFactory <> ("rType"));

        clientController = new com.walle.controllers.ClientController ();
        try {
            clients = clientController.displayClient ( );
        } catch (Exception e) {
            System.out.println (e.getMessage ( ));
        }

        data = insertData ( );

        tableID.setItems (data);

    }

    public Pane loadClient(AnchorPane home, Pane pnlClient) throws IOException {
        AnchorPane pane = FXMLLoader.load (getClass ( ).getClassLoader ( ).getResource ("client.fxml"));
        pane.prefHeightProperty ( ).bind (home.heightProperty ( ));
        pane.prefWidthProperty ( ).bind (home.widthProperty ( ));
        pnlClient.getChildren ( ).setAll (pane);
        return pnlClient;
    }

}