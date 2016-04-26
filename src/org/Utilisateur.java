/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;
import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
/**
 *
 * @author jridi
 */
public class Utilisateur {
    private String nom,prenom,pays,mdp,pseudo,cin_passport,sexe;
    private Date date_naissance;
    private int niveau_id,type_id,cycle_id;


    public Utilisateur(String nom, String prenom, Date date_naissance, String cin_passport, int cycle_id, int niveau_id, String sexe, String pays, String pseudo, String mdp, int type_id) 
    {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.cin_passport = cin_passport;
        this.cycle_id = cycle_id;
        this.niveau_id = niveau_id;
        this.sexe = sexe;
        this.pays = pays;
        this.pseudo = pseudo;
        this.mdp = mdp;
        this.type_id = type_id;
        
        
    }
    
    public void creer_utilisateur(Utilisateur u)
    {
        Connection c = SqliteJDBC.connecter();
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

    public Date getDateDeNaissance()
    {
        return date_naissance;
    }
    
    public void setDateDeNaissance(Date date)
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