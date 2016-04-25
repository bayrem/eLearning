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
    
    public Connection connecter()
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
    
    public void creer_utilisateur(Utilisateur u)
    {
        Connection c = connecter();
        Statement stmt = null;
        int type_id, niveau_id, cycle_id;
        try {

            stmt = c.createStatement();
            String sql = "INSERT INTO Utilisateur (Nom,Prenom,date_de_naissance,cin_passport,cycle_id,sexe_id,niveau_id,pays_id,pseudo,mdp,type_id) " +
                         "VALUES (" + u.getNom() + "," + u.getPrenom()+ "," + u.getDateDeNaissance() + "," + u.getCin_passport()+ "," + u.getCycle_id()+ ","  + u.getNiveau_id()+ ","  
                    + u.getPays()+ ","  + u.getPseudo()+ ","  + u.getMdp()+ ","  + u.getType_id()+ ");"; 
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } 
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
    
}
