package com.walle.repository;

import com.walle.entities.Client;
import com.walle.entities.Product;
import com.walle.entities.Purchase;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PurchaseRepository {

    public Purchase getById(Integer id) throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        Purchase purchase = null;
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from purchase where id = ?");
        stmt.setInt (1,id);
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            purchase = extractPurchase(rs);
        }
        stmt.close ();
        connection.close ();

        return purchase;
    }

    public List<Purchase> getAll() throws Exception{
        ArrayList<Purchase> purchases = new ArrayList <Purchase> ();
        Connection connection = ConectorManager.makeConnection ();
        Purchase purchase ;
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from purchase ");
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            purchase = extractPurchase(rs);
            purchases.add (purchase);
        }
        stmt.close ();
        connection.close ();

        return purchases;
    }

    public Integer insert(Purchase purchase) throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("INSERT into purchase values (?,?,?,?,?) ");
        stmt.setInt (1,purchase.getId ());
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        Date date = sdf.parse (purchase.getData ());
        java.sql.Date sqlData = new java.sql.Date (date.getTime ( ));
        stmt.setDate (2,sqlData);
        stmt.setInt (3,purchase.getProductQuantity ());
        stmt.setString (4,purchase.getProduct ().getId ());
        stmt.setInt (5,purchase.getClient ().getId ());
        return executeQuery (stmt);
    }

    public Integer update(Purchase purchase) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("update purchase set data = ? , quantity = ?,id_product = ?, id_client = ? " +
                "where id = ?");
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        Date date = sdf.parse (purchase.getData ());
        java.sql.Date sqlData = new java.sql.Date (date.getTime ( ));
        stmt.setDate (1,sqlData);
        stmt.setInt (2,purchase.getProductQuantity ());
        stmt.setString (3,purchase.getProduct ().getId ());
        stmt.setInt (4,purchase.getClient ().getId ());
        stmt.setInt (5,purchase.getId ());

        return executeQuery (stmt);
    }

    public Integer delete(Integer id) throws  Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("DELETE from purchase where id = ?");
        stmt.setInt (1,id);
        return executeQuery (stmt);
    }


    private Purchase extractPurchase(ResultSet rs) throws Exception {
        ClientRepository clientRepository = new ClientRepository ();
        Client client = clientRepository.getById (rs.getInt (5));
        ProductRepository productRepository = new ProductRepository ();
        Product product = productRepository.getByID (rs.getString (4));
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        String data = sdf.format (rs.getDate (2));
        Purchase purchase = new Purchase (rs.getInt (1),data,rs.getInt (3),product,client);
        return purchase;
    }

    private Integer executeQuery(PreparedStatement statement) throws Exception{
        Integer i = statement.executeUpdate ();
        statement.close ( );
        if (i == 1) return 0;
        else return 1;
    }

}
