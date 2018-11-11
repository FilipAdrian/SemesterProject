package com.walle.repository;

import com.walle.entities.Country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CountryRepository {

    public Country  getById(Integer id) throws Exception{
        Country country = null;
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("SELECT  * from country where id = ?");
        stmt.setInt (1,id);
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            country = extractCountry (rs);

        }
        stmt.close ();
        connection.close ();

        return country;
    }

    public List<Country> getAll () throws  Exception{
        Country country = null;
        ArrayList <Country> countryArrayList = new ArrayList <Country> ();
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt =connection.prepareStatement ("SELECT  * from country");
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            country = extractCountry (rs);
            countryArrayList.add (country);
        }
        stmt.close ();
        connection.close ();

        return countryArrayList;
    }

    public Integer deleteById(Integer id ) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("DELETE from country where id = ?");
        stmt.setInt (1,id);

        return executeQuery (stmt);

    }

    public Integer update(Country country) throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("update country set name = ? where id = ?");
        stmt.setString (1,country.getName ());
        stmt.setInt (2,country.getId ());

        return executeQuery (stmt);


    }

    public Integer insert(Country country) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("Insert into country values (?,?)");
        stmt.setInt (1,country.getId ());
        stmt.setString (2,country.getName ());

        return executeQuery (stmt);
    }


    private Integer executeQuery(PreparedStatement statement) throws Exception{
        Integer i = statement.executeUpdate ();
        statement.close ( );
        statement.getConnection ().close ();
        if (i == 1) return 0;
        else return 1;
    }

    private Country extractCountry(ResultSet rs) throws Exception{
        Country country = new Country (rs.getInt ("id"),rs.getString ("name"));
        return  country;

    }
}
