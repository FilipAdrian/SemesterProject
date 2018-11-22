package com.walle.repository;

import com.walle.entities.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
    public Client getById(Integer id) throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        Client client =null;
        PreparedStatement stmt = connection.prepareStatement ("SELECT  * from client where id = ?");
        stmt.setInt (1,id);
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            client = extractClient(rs);
        }
        connection.close ();
        stmt.close ();

        return client;
    }

    public List<Client> getAll() throws  Exception{
        ArrayList<Client> clientArrayList = new ArrayList <Client> ();
        Client client = new Client ();
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from client");
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            client = extractClient (rs);
            clientArrayList.add (client);
        }
        stmt.close ();
        connection.close ();

        return clientArrayList;
    }

    public Integer insert(Client client) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("INSERT  into client values (?,?,?,?,?,?,?,?)");
        stmt.setInt (1,client.getId ());
        stmt.setString (2,client.getName ());
        stmt.setString (3,client.getSurname ());
        stmt.setString (4,client.getPhone ());
        stmt.setString (5,client.getEmail ());
        stmt.setInt (6,client.getCountry ());
        stmt.setString (7,client.getAddress ());
        stmt.setInt (8,client.getType ());

        return executeQuery (stmt);
    }

    public Integer update(Client client) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("update client set  name = ?,surname = ?,phone =?,email = ?," +
                "id_country = ?,address = ?,id_type = ?" +
                "where id = ?");
        stmt.setString (1,client.getName ());
        stmt.setString (2,client.getSurname ());
        stmt.setString (3,client.getPhone ());
        stmt.setString (4,client.getEmail ());
        stmt.setInt (5,client.getCountry ());
        stmt.setString (6,client.getAddress ());
        stmt.setInt (7,client.getType ());
        stmt.setInt (8,client.getId ());

        return executeQuery (stmt);
    }

    public Integer deleteById(Integer id) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("DELETE  from client where id = ?");
        stmt.setInt (1,id);

        return executeQuery (stmt);
    }
    private Client extractClient(ResultSet rs) throws Exception{

        Client client = new Client (rs.getInt (1),rs.getString (2),rs.getString (3),
                rs.getString (4),rs.getString (5),rs.getInt (6),
                rs.getString (7));

        return  client;
    }

    private Integer executeQuery(PreparedStatement statement) throws Exception{
        Integer i = statement.executeUpdate ();
        statement.close ( );
        statement.getConnection ().close ();
        if (i == 1) return 0;
        else return 1;
    }


}
