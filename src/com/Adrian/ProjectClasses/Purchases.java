package com.Adrian.ProjectClasses;

import java.util.Date;
import java.util.HashMap;

public class Purchases {
    private  Long idPurcases;
    private  Date purchaseData;
    private Integer purchaseProductQuantity;
    HashMap <String, Product> productList = new HashMap <> ( );
    HashMap <Long, User> userList = new HashMap <> ( );


}
