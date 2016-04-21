/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;
import java.util.*;
/**
 *
 * @author jridi
 */
public class Utilisateur {
    private String nom,prenom,pays,niveau_etude,mdp,pseudo,cin_passport,sexe,profession;
    private Date date_naissance;


    public Utilisateur(String nom, String prenom, Date date_naissance, String cin_passport, String niveau_etude, String sexe, String profession, String pays, String pseudo, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.cin_passport = cin_passport;
        this.niveau_etude = niveau_etude;
        this.sexe = sexe;
        this.profession = profession;
        this.pays = pays;
        this.pseudo = pseudo;
        this.mdp = mdp;
      
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

    public String getNiveau_etude() {
        return niveau_etude;
    }

    public void setNiveau_etude(String niveau_etude) {
        this.niveau_etude = niveau_etude;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


 
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

public  boolean equals ( Object e1) {
		return false;	
			}

    @Override
    public String toString() {
        return "Etudiant{" + "nom=" + nom + ", prenom=" + prenom + ", date de naissance =" + date_naissance + ", pays=" + pays + ", niveau_etude=" + niveau_etude + ", mdp=" + mdp + ", pseudo=" + pseudo + ", cin_passport=" + cin_passport + ", sexe=" + sexe + ", profession=" + profession +  '}';
    }
    
    
    
    
    public void afficheretudiant()
	{
		System.out.println( nom ) ; 
		System.out.println( prenom ) ;
                System.out.println( date_naissance ) ;
                System.out.println( cin_passport ) ;
                System.out.println(  niveau_etude ) ;
                System.out.println( sexe ) ;        
		System.out.println( profession ) ;
                System.out.println( pays ) ;
                System.out.println( pseudo ) ;
                System.out.println( mdp ) ;
		
	}
    
    
    public void modifierEtudiant(String nomnv, String prenomnv, int journv, int moisnv, int anneenv, String cin_passportnv, String niveau_etudenv, String sexenv, String professionnv, String paysnv, String pseudonv, String mdpnv){
  
        
         Scanner s = new Scanner(System.in) ; 
		 @SuppressWarnings("resource")
		 Scanner s1 = new Scanner(System.in) ; 

		 	       if((this.cin_passport.equals(cin_passport)))
		 	     {     this.nom = nomnv;
                                   this.prenom = prenomnv;                               
                                   this.cin_passport = cin_passportnv;
                                   this.niveau_etude = niveau_etudenv;
                                   this.sexe = sexenv;
                                   this.profession = professionnv;
                                   this.pays = paysnv;
                                   this.pseudo = pseudonv;
                                   this.mdp = mdpnv; 
                             }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}