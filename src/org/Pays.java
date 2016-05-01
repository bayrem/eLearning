/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static org.SqliteJDBC.connecter;

/**
 *
 * @author jridi
 */
public class Pays {
    private String iso,nom_maj,nom,iso3;
    private static int pays_id,numcode,phonecode;

    public String getNom(int i) {
        Connection c = connecter();
        Statement stmt = null;
        try 
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT pays_id FROM Pays where pays_id = \"" + i +"\";" );
            while ( rs.next() ) {
                nom = rs.getString("nom");
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
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNom_maj() {
        return nom_maj;
    }

    public void setNom_maj(String nom_maj) {
        this.nom_maj = nom_maj;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public static int getPays_id(String nom) {
        Connection c = connecter();
        Statement stmt = null;
        try 
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT pays_id FROM Pays where nom = \"" + nom +"\";" );
            while ( rs.next() ) {
                pays_id = rs.getInt("pays_id");
                System.out.println(pays_id);
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
        return pays_id;
    }
    
    public static ArrayList<String> getAllPays() {
        Connection c = connecter();
        ArrayList<String> pays = new ArrayList<String>();
        Statement stmt = null;
        try 
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Pays;" );
            while ( rs.next() ) {
                String p = rs.getString("nom");
                pays.add(p);
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
        return pays;
    }

    public void setPays_id(int pays_id) {
        this.pays_id = pays_id;
    }

    public int getNumcode() {
        return numcode;
    }

    public void setNumcode(int numcode) {
        this.numcode = numcode;
    }

    public int getPhonecode() {
        return phonecode;
    }

    public void setPhonecode(int phonecode) {
        this.phonecode = phonecode;
    }
}
