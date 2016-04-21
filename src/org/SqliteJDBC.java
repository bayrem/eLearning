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
    
    public void connecter()
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
    }
    
    public void select_cycle()
    {
        
    }
    
}
