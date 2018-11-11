package com.walle.repository;

import com.walle.entities.Warehouse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class WarehouseRepository  {

    public Warehouse getById(Integer id) throws Exception{
        Warehouse warehouse = null;
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from warehouse where id = ?");
        stmt.setInt (1,id);
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            warehouse=extractWarehouse (rs);
        }
        stmt.close ();
        connection.close ();

        return  warehouse;
    }

    public List<Warehouse> getAll() throws Exception{
        Warehouse warehouse = null;
        ArrayList<Warehouse> warehouses = new ArrayList <Warehouse> ();
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from warehouse");
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            warehouse = extractWarehouse (rs);
            warehouses.add (warehouse);
        }
        stmt.close ();
        connection.close ();

        return warehouses;
    }

    public Integer insert(Warehouse warehouse) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("INSERT  into warehouse values (?,?,?,?,?)");
        stmt.setInt (1,warehouse.getId ());
        stmt.setString (2,warehouse.getName ());
        stmt.setInt (3,warehouse.getCountry ().getId ());
        stmt.setString (4,warehouse.getAddress ());
        stmt.setString (5,warehouse.getPhone ());

        return executeQuery (stmt);
    }

    public Integer update(Warehouse warehouse) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt =connection.prepareStatement ("UPDATE warehouse set name = ?, id_country = ? ," +
                " address = ?, phone = ? where  id = ?");
        stmt.setString (1,warehouse.getName ());
        stmt.setInt (2,warehouse.getCountry ().getId ());
        stmt.setString (3,warehouse.getAddress ());
        stmt.setString (4,warehouse.getPhone ());
        stmt.setInt (5,warehouse.getId ());

        return executeQuery (stmt);

    }

    public Integer deleteById (Integer id) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("DELETE from warehouse where id = ?");
        stmt.setInt (1,id);

        return executeQuery (stmt);
    }

    private Warehouse extractWarehouse (ResultSet rs) throws Exception{
        Integer idCountry = rs.getInt (3);
        CountryRepository countryRepository =new CountryRepository ();
        Warehouse warehouse = new Warehouse (rs.getInt (1),rs.getString (2),
                countryRepository.getById (idCountry),rs.getString (4),rs.getString (5));
        return  warehouse;
    }

    private Integer executeQuery(PreparedStatement statement) throws Exception{
        Integer i = statement.executeUpdate ();
        statement.close ( );
        statement.getConnection ().close ();
        if (i == 1) return 0;
        else return 1;
    }


}
