/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhhhh;

/**
 *
 * @author Dell
 */
public class Enseignent {
    
    private String nom , prenom  ; 
       private int jour,mois , annee ;
       private String cin_passport  ;
       private String module_enseigné , sexe , profession , pays; 
       private String pseudo , mdp , e_mail ;

    public Enseignent() {
        
         nom  = "" ;
         prenom = "";
         jour = 1 ; 
         mois  = 01;
         annee = 2016;
         cin_passport =  ""; 
         sexe= "";
         module_enseigné = "";
         profession = "" ;
         pays = "" ;
         pseudo = "" ; 
         mdp =" " ; 
          e_mail=" " ; 
        
        
    }

    public Enseignent(String nom, String prenom, int jour, int mois, int annee, String cin_passport, String module_enseigné, String sexe, String profession, String pays, String pseudo, String mdp, String e_mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.cin_passport = cin_passport;
        this.module_enseigné = module_enseigné;
        this.sexe = sexe;
        this.profession = profession;
        this.pays = pays;
        this.pseudo = pseudo;
        this.mdp = mdp;
        this.e_mail = e_mail;
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

    public String getModule_enseigné() {
        return module_enseigné;
    }

    public void setModule_enseigné(String module_enseigné) {
        this.module_enseigné = module_enseigné;
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

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    @Override
    public String toString() {
        return "Enseignent{" + "nom=" + nom + ", prenom=" + prenom + ", jour=" + jour + ", mois=" + mois + ", annee=" + annee + ", cin_passport=" + cin_passport + ", module_enseign\u00e9=" + module_enseigné + ", sexe=" + sexe + ", profession=" + profession + ", pays=" + pays + ", pseudo=" + pseudo + ", mdp=" + mdp + ", e_mail=" + e_mail + '}';
    }
    
    
    
    
    
    public  boolean equals ( Object e1) {
	
	Enseignent  e =(Enseignent)e1;
	if (cin_passport.equals(e.cin_passport))
		
		return true;
	else
		return false;
			}

    
    public void afficheretudiant()
	{
		System.out.println( nom ) ; 
		System.out.println( prenom ) ;
                System.out.println( jour +"/"+ mois +"/"+ annee ) ;
                System.out.println( cin_passport ) ;
                System.out.println(  module_enseigné ) ;
                System.out.println( sexe ) ;        
		System.out.println( profession ) ;
                System.out.println( pays ) ;
                System.out.println( pseudo ) ;
                System.out.println( mdp ) ;
                  System.out.println( e_mail ) ;
		
	}
       
       
       
    
    
    
    
    
    
    
    
}
