package com.walle.repository;

import com.walle.entities.Client;
import com.walle.entities.Product;
import com.walle.entities.Sales;
import com.walle.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesRepository {
    public Sales getById(Integer id) throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        Sales sales = null;
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from sales where id = ?");
        stmt.setInt (1,id);
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            sales = extractSales(rs);
        }
        stmt.close ();
        connection.close ();

        return sales;
    }

    public List<Sales> getAll() throws Exception{
        ArrayList<Sales> saless = new ArrayList <Sales> ();
        Connection connection = ConectorManager.makeConnection ();
        Sales sales ;
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from sales ");
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            sales = extractSales(rs);
            saless.add (sales);
        }
        stmt.close ();
        connection.close ();

        return saless;
    }

    public Integer insert(Sales sales) throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("INSERT into sales values (?,?,?,?,?,?) ");
        stmt.setInt (1,sales.getId ());
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        Date date = sdf.parse (sales.getData ());
        java.sql.Date sqlData = new java.sql.Date (date.getTime ( ));
        stmt.setDate (2,sqlData);
        stmt.setInt (4,sales.getUser ());
        stmt.setInt (3,sales.getProductQuantity ());
        stmt.setString (5,sales.getProduct ());
        stmt.setInt (6,sales.getClient ());

        return executeQuery (stmt);
    }

    public Integer update(Sales sales) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("update sales set data = ? , quantity = ?,id_user = ?,id_product = ?, id_client = ?" +
                "where id = ?");
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        Date date = sdf.parse (sales.getData ());
        java.sql.Date sqlData = new java.sql.Date (date.getTime ( ));
        stmt.setDate (1,sqlData);
        stmt.setInt (2,sales.getProductQuantity ());
        stmt.setInt (3,sales.getUser ());
        stmt.setString (4,sales.getProduct ());
        stmt.setInt (5,sales.getClient ());
        stmt.setInt (6,sales.getId ());

        return executeQuery (stmt);
    }

    public Integer delete(Integer id) throws  Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("DELETE from sales where id = ?");
        stmt.setInt (1,id);
        return executeQuery (stmt);
    }


    private Sales extractSales(ResultSet rs) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        String data = sdf.format (rs.getDate (2));
        Sales sales = new Sales (rs.getInt (1),data,rs.getInt (3),
                rs.getInt (4),rs.getString (5),rs.getInt (6));
        return sales;
    }

    private Integer executeQuery(PreparedStatement statement) throws Exception{
        Integer i = statement.executeUpdate ();
        statement.close ( );
        if (i == 1) return 0;
        else return 1;
    }
}
