package com.walle.repository;

import com.walle.entities.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoleRepository {

    public Object getById(Integer id) throws Exception {
        Role role = new Role ();
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("SELECT  * from role where id = ?");
        stmt.setInt (1,id);
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            role = extractRole (rs);
        }
        stmt.close ();
        connection.close ();

        return role;
    }

    public List <Role> getAll() throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        Role role = new Role ();
        List<Role> roleArrayList = new ArrayList <Role> ();
        PreparedStatement stmt = connection.prepareStatement ("SELECT * from role");
        ResultSet rs = stmt.executeQuery ();
        while (rs.next ()){
            role = extractRole (rs);
            roleArrayList.add (role);
        }
        stmt.close ();
        connection.close ();

        return roleArrayList;
    }

    public Integer insert(Role role) throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("INSERT into role values (?,?)");
        stmt.setInt (1,role.getId ());
        stmt.setString (2,role.getName ());
        return executeQuery (stmt);
    }

    public Integer update(Role role) throws Exception {
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("UPDATE role set name = ? where id = ?");
        stmt.setString (1,role.getName ());
        stmt.setInt (2,role.getId ());

        return executeQuery (stmt);
    }

    public Integer deleteById(Integer id) throws Exception{
        Connection connection = ConectorManager.makeConnection ();
        PreparedStatement stmt = connection.prepareStatement ("DELETE  from role where  id = ?");
        stmt.setInt (1,id);

        return executeQuery (stmt);
    }

    public Integer executeQuery(PreparedStatement statement) throws Exception {
        Integer i = statement.executeUpdate ( );
        statement.close ( );
        statement.getConnection ( ).close ( );
        if (i == 1) return 0;
        else return 1;
    }

    private Role extractRole (ResultSet rs) throws Exception{
        Role role = new Role (rs.getInt (1),rs.getString (2));
        return role;
    }


}
