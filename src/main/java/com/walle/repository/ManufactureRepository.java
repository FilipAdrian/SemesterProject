package com.walle.repository;

import com.walle.entities.Country;
import com.walle.entities.Manufacture;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManufactureRepository {

    /** DE FACUT !!!!!
     *
     * @param id
     * @return
     * @throws SQLException
     *
     * fiecare conection pentru fiecare metoda la fel ca si manufacture
     * metodelle nu trebuuie sa fie statice
     * plus la asta de fiecare dat trebuie de inchis conectorul
     * tipul variabile returnat pt colectii sa fie de tip list
     * de inchis fiecare statement
     * hash function
     * de omis null din tabele
     * la staff de add 3 coloane nivel de acces,par,username
     * de facut transit intre viewuri
     *
     */

    public  Manufacture getById (Integer id) throws Exception {
        Connection connection = ConectorManager.makeConnection ( );
        Manufacture manufacture = null;
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from manufacture where id = ?");
        stmt.setInt (1,id);
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            manufacture = extractManufacture (rs);
        }

        stmt.close ();
        connection.close ();

        return manufacture;
    }

    public List<Manufacture> getAll() throws Exception{
        Connection connection = ConectorManager.makeConnection ( );
        Manufacture manufacture = null;
        ArrayList<Manufacture> manufactures = new ArrayList <Manufacture> ();
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from manufacture");
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            manufacture=extractManufacture (rs);
            manufactures.add (manufacture);
        }

        stmt.close ();
        connection.close ();

        return manufactures;
    }

    public Integer deleteById(Integer id)throws Exception{
        Connection connection = ConectorManager.makeConnection ( );
        Manufacture manufacture = null;
        PreparedStatement stmt = connection.prepareStatement ("DELETE from manufacture where id = ?");
        stmt.setInt (1,id);

        return executeQuery (stmt);

    }

    public Integer update(Manufacture manufacture) throws Exception{
        Connection connection = ConectorManager.makeConnection ( );
        PreparedStatement stmt = connection.prepareStatement ("UPDATE manufacture set name = ?,id_country = ?,address = ?" +
                "where id = ?");
        stmt.setString (1,manufacture.getName ());
        stmt.setInt (2, manufacture.getCountry ());
        stmt.setString (3,manufacture.getAddress ());
        stmt.setInt (4,manufacture.getId ());

        return executeQuery (stmt);

    }

    public Integer insert(Manufacture manufacture) throws Exception{
        Connection connection = ConectorManager.makeConnection ( );
        PreparedStatement stmt = connection.prepareStatement ("Insert into manufacture values (?,?,?,?)");
        stmt.setInt (1,manufacture.getId ());
        stmt.setString (2,manufacture.getName ());
        stmt.setInt (3, manufacture.getCountry());
        stmt.setString (4,manufacture.getAddress ());

        return executeQuery (stmt);

    }

    private Manufacture extractManufacture(ResultSet rs) throws Exception{
        Manufacture manufacture = new Manufacture (rs.getInt (1),rs.getString (2),
                rs.getInt (3),rs.getString (4));

        return manufacture;

    }

    private Integer executeQuery(PreparedStatement statement) throws Exception{
        Integer i = statement.executeUpdate ();
        statement.close ( );
        statement.getConnection ().close ();
        if (i == 1) return 0;
        else return 1;
    }


}
