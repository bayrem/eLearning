/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.sql.*;

/**
 *
 * @author jridi
 */
public class SqliteJDBC {
    
 
    public SqliteJDBC(){
    }
    
    public static Connection connecter()
    {
        Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:e.learning.sqlite");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
    
    return c;
    }
    
    public void select_cycle()
    {
        Connection c = connecter();
        Statement stmt = null;
        try 
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Cycle;" );
            while ( rs.next() ) {
                int id = rs.getInt("cycle_id");
                String  name = rs.getString("cycle");
                System.out.println(id + name);
            }
            rs.close();
            stmt.close();
            c.close();
        } 
        catch ( Exception e ) 
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
    
    public void select_niveau()
    {
        Connection c = connecter();
        Statement stmt = null;
        try 
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Niveau;" );
            while ( rs.next() ) {
                int id = rs.getInt("niveau_id");
                String  name = rs.getString("niveau");
                System.out.println(id + name);
            }
            rs.close();
            stmt.close();
            c.close();
        } 
        catch ( Exception e ) 
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
    
    
    
}
