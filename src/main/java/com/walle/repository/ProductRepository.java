package com.walle.repository;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.walle.entities.Manufacture;
import com.walle.entities.Product;

public class ProductRepository {

    public Product getByID(String productID) throws Exception {
        Connection connection = ConectorManager.makeConnection ( );
        Product product = null;
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from product where id = ?");
        stmt.setString (1, productID);
        ResultSet rs = stmt.executeQuery ( );
        while (rs.next ( )) {
            product = extractProduct (rs);
        }
        stmt.close ( );
        connection.close ( );

        return product;
    }

    public List <Product> getAll() throws Exception {
         long start= System.currentTimeMillis ();
        Connection connection = ConectorManager.makeConnection ( );
        ArrayList <Product> products = new ArrayList <> ( );
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from product ");
        ResultSet rs = stmt.executeQuery ( );
        while (rs.next ()) {
            Product product = extractProduct (rs);
            products.add (product);
        }
        stmt.close ();
        connection.close ();
        long finish = System.currentTimeMillis ();
        long timeElapsed = finish - start;
        System.out.println ("Time taken is : " + timeElapsed );

        return products;
    }

    public Integer insert(Product product) throws Exception {
        Connection connection = ConectorManager.makeConnection ( );
        PreparedStatement stmt = connection.prepareStatement ("INSERT  into product values (?,?,?,?,?,?,?)");
        stmt.setString (1, product.getId ( ));
        stmt.setString (2, product.getName ( ));
        stmt.setInt (3,product.getQuantity ());
        BigDecimal price = new BigDecimal (product.getPrice ( ));
        stmt.setBigDecimal (4, price);
        BigDecimal cost = new BigDecimal (product.getCost ( ));
        stmt.setBigDecimal (5, cost);
        Integer idManufacture = product.getManufacture ( );
        stmt.setInt (6, idManufacture);
        Integer idWarehouse = product.getWarehouse ();
        stmt.setInt (7,idWarehouse);

        return executeQuery (stmt);
    }

    public Integer update(Product product) throws Exception {
        Connection connection = ConectorManager.makeConnection ( );
        PreparedStatement stmt = connection.prepareStatement ("UPDATE product set name = ?,quantity=?,price = ?," +
                "cost = ?,id_manufacture = ?,id_warehouse = ? where id = ?");
        stmt.setString (1, product.getName ( ));
        stmt.setInt (2,product.getQuantity ());
        BigDecimal price = new BigDecimal (product.getPrice ( ));
        stmt.setBigDecimal (3, price);
        BigDecimal cost = new BigDecimal (product.getCost ( ));
        stmt.setBigDecimal (4, cost);
        Integer idManufacture = product.getManufacture ( );
        stmt.setInt (5, idManufacture);
        Integer idWarehouse = product.getWarehouse ();
        stmt.setInt (6,idWarehouse);
        stmt.setString (7, product.getId ( ));

        return executeQuery (stmt);
    }

    public Integer deleteById(String id) throws Exception {
        Connection connection = ConectorManager.makeConnection ( );
        PreparedStatement stmt = connection.prepareStatement ("DELETE from product where id =?");
        stmt.setString (1, id);

        return executeQuery (stmt);
    }

    private Integer executeQuery(PreparedStatement statement) throws Exception{
        Integer i = statement.executeUpdate ();
        statement.close ( );
        statement.getConnection ().close ();
        if (i == 1) return 0;
        else return 1;
    }

    private Product extractProduct(ResultSet rs) throws Exception {


        Product product = new Product (rs.getString (1), rs.getString (2), rs.getInt (3),
                rs.getDouble (4), rs.getDouble (5),rs.getInt (6),rs.getInt (7) );

        return product;
    }


}
