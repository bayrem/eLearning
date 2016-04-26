/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package org;

public class etudiant1 {
       private String nom , prenom  ; 
       private int jour,mois , annee ;
       private String cin_passport  ;
       private String niveau_etude , sexe , profession , pays; 
       private String pseudo , mdp ;
  

    public etudiant1() {
        
        nom  = "" ;
         prenom = "";
         jour = 1 ; 
         mois  = 01;
         annee = 2016;
         cin_passport =  ""; 
         sexe= "";
         niveau_etude = "";
         profession = "" ;
         pays = "" ;
         pseudo = "" ; 
         mdp =" " ; 
         
         
         
         
        
    }

    public etudiant1(String nom, String prenom, int jour, int mois, int annee, String cin_passport, String niveau_etude, String sexe, String profession, String pays, String pseudo, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
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

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getCin_passport() {
        return cin_passport;
    }

    public void setCin_passport(String cin_passport) {
        this.cin_passport = cin_passport;
    }

    public String getNiveau_etude() {
        return niveau_etude;
    }

    public void setNiveau_etude(String niveau_etude) {
        this.niveau_etude = niveau_etude;
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

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

      
 public  boolean equals ( Object e1) {
	
	etudiant1  e =(etudiant1)e1;
	if (cin_passport.equals(e.cin_passport))
		
		return true;
	else
		return false;
			}

    @Override
    public String toString() {
        return "etudiant{" + "nom=" + nom + ", prenom=" + prenom + ", jour=" + jour + ", mois=" + mois + ", annee=" + annee + ", cin_passport=" + cin_passport + ", niveau_etude=" + niveau_etude + ", sexe=" + sexe + ", profession=" + profession + ", pays=" + pays + ", pseudo=" + pseudo + ", mdp=" + mdp  +'}';
    }
    
    
       public void afficheretudiant()
	{
		System.out.println( nom ) ; 
		System.out.println( prenom ) ;
                System.out.println( jour +"/"+ mois +"/"+ annee ) ;
                System.out.println( cin_passport ) ;
                System.out.println(  niveau_etude ) ;
                System.out.println( sexe ) ;        
		System.out.println( profession ) ;
                System.out.println( pays ) ;
                System.out.println( pseudo ) ;
                System.out.println( mdp ) ;
		
	}
       
    
    
      
    
    
    
    
    
}
