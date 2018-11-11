package com.walle.repository;
import  java.sql.*;
import java.sql.Statement;

public class ConectorManager {
    private static final String url = "jdbc:postgresql://localhost:5432/Company";
    private  static final String userName = "postgres";
    private  static  final  String password = "postgres";

            public static Connection makeConnection(){
                Connection myConnection = null;
                try{

                    myConnection = DriverManager.getConnection (url, userName, password);


                }
                catch (SQLException ex){
                    System.out.println (ex.getMessage () );
                    ex.printStackTrace ( );
                    System.err.println (ex.getClass ( ).getName ()+ ": "+ ex.getMessage ( ));
                    System.exit (0);
                }

                return myConnection;


            }
}
