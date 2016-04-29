/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;
import java.sql.Connection;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jridi
 */
public class Utilisateur {
    private String nom,prenom,pays,mdp,pseudo,cin_passport,sexe,date_naissance;
    private int niveau_id,type_id,cycle_id;


    Utilisateur(String nom, String prenom, String d2n, String cin_passport, String cycle, String niveau, String sexe, String pays, String pseudo, String mdp, String type)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = d2n;
        this.cin_passport = cin_passport;
        if (cycle.equals(""))
        {
            this.cycle_id = 0;
        } else if (cycle.equals("Licence"))
        {
            this.cycle_id = 1;
        } else 
        {
            this.cycle_id = 2;
        }
        if (niveau.equals(""))
        {
            this.niveau_id = 0;
        } else if (niveau.equals("1"))
        {
            this.niveau_id = 1;
        }else if (niveau.equals("2"))
        {
            this.niveau_id = 2;
        } else 
        {
            this.niveau_id = 3;
        }
        this.sexe = sexe;
        this.pays = pays;
        this.pseudo = pseudo;
        this.mdp = mdp;
        if (type.equals("1"))
        {
            this.niveau_id = 1;
        } else 
        {
            this.niveau_id = 2;
        }
        
    }

    
    public void creer_utilisateur(Utilisateur u)
    {
        Connection c = SqliteJDBC.connecter();
        Statement stmt = null;
        try {

            stmt = c.createStatement();
            String sql = "INSERT INTO Utilisateur (Nom,Prenom,date_de_naissance,cin_passport,cycle_id,sexe_id,niveau_id,pays_id,pseudo,mdp,type_id) " +
                         "VALUES (" + this.nom + "," + this.prenom+ "," + this.date_naissance + "," + this.cin_passport + "," + this.cycle_id + ","  + this.niveau_id + ","  
                    + this.pays + ","  + this.pseudo + ","  + this.mdp + ","  + this.type_id + ");"; 
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
    
    public void modifierEtudiant(){

    
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getCin_passport() {
        return cin_passport;
    }

    public void setCin_passport(String cin_passport) {
        this.cin_passport = cin_passport;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDateDeNaissance()
    {
        return date_naissance;
    }
    
    public void setDateDeNaissance(String date)
    {
        this.date_naissance = date;
    }
    
    public int getType_id() {
        return type_id;
    }

    public void setType_id() {
        
        this.type_id = type_id;
    }
    
    public int getNiveau_id() {
        return niveau_id;
    }

    public void setNiveau_id(int niveau_id) {
        this.niveau_id = niveau_id;
    }

    public int getCycle_id() {
        return cycle_id;
    }

    public void setCycle_id(int cycle_id) {
        this.cycle_id = cycle_id;
    }
 
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    
    
    
    public void afficherUtilisateur()
	{
		System.out.println( nom ) ; 
		System.out.println( prenom ) ;
                System.out.println( date_naissance ) ;
                System.out.println( cin_passport ) ;
                System.out.println( cycle_id ) ;
                System.out.println(  niveau_id ) ;
                System.out.println( sexe ) ;        
                System.out.println( pays ) ;
                System.out.println( pseudo ) ;
                System.out.println( mdp ) ;
		System.out.println( type_id ) ;
	}
       
}