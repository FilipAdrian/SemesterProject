package com.walle.repository;

import com.walle.entities.Country;
import com.walle.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public User getById(Integer id) throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        User user =null;
        PreparedStatement stmt = connection.prepareStatement ("SELECT  * from users where id = ?");
        stmt.setInt (1,id);
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            user = extractUser(rs);
        }
        connection.close ();
        stmt.close ();

        return user;
    }

    public List<User> getAll() throws  Exception{
        ArrayList<User> userArrayList = new ArrayList <User> ();
        User user = new User ();
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from users");
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            user = extractUser (rs);
            userArrayList.add (user);
        }
        stmt.close ();
        connection.close ();

        return userArrayList;
    }

    public Integer insert(User user) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("INSERT  into users values (?,?,?,?,?,?,?,?,?,?)");
        stmt.setInt (1,user.getId ());
        stmt.setString (2,user.getName ());
        stmt.setString (3,user.getSurname ());
        stmt.setString (4,user.getPhone ());
        stmt.setString (5,user.getEmail ());
        stmt.setInt (6,user.getCountry ().getId ());
        stmt.setString (7,user.getAddress ());
        stmt.setString (8,user.getLogin ());
        stmt.setString (9,user.getPassword ());
        stmt.setInt (10,user.getRole ().getId ());

        return executeQuery (stmt);
    }

    public Integer update(User user) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("update users set  name = ?,surname = ?,phone =?,email = ?," +
                "id_country = ?,address = ?,login = ?,password = ? ,id_role = ?" +
                "where id = ?");
        stmt.setString (1,user.getName ());
        stmt.setString (2,user.getSurname ());
        stmt.setString (3,user.getPhone ());
        stmt.setString (4,user.getEmail ());
        stmt.setInt (5,user.getCountry ().getId ());
        stmt.setString (6,user.getAddress ());
        stmt.setString (7,user.getLogin ());
        stmt.setString (8,user.getPassword ());
        stmt.setInt (9,user.getRole ().getId ());
        stmt.setInt (10,user.getId ());


        return executeQuery (stmt);
    }

    public Integer deleteById(Integer id) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("DELETE  from users where id = ?");
        stmt.setInt (1,id);

        return executeQuery (stmt);
    }
    private User extractUser(ResultSet rs) throws Exception{
        Integer idCountry = rs.getInt (6);
        CountryRepository countryRepository = new CountryRepository ();
        User user = new User (rs.getInt (1),rs.getString (2),rs.getString (3),
                rs.getString (4),rs.getString (5),countryRepository.getById (idCountry),
                rs.getString (7));

        return  user;
    }

    private Integer executeQuery(PreparedStatement statement) throws Exception{
        Integer i = statement.executeUpdate ();
        statement.close ( );
        statement.getConnection ().close ();
        if (i == 1) return 0;
        else return 1;
    }


}
