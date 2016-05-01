/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author jridi
 */
public class Cours {
    private int cours_id, group_id;
    private String cours, link;

    public Cours(int group_id, String cours, String link) {
        this.group_id = group_id;
        this.cours = cours;
        this.link = link;
    }
    
    public int getCours_id() {
        return cours_id;
    }

    public void setCours_id(int cours_id) {
        this.cours_id = cours_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
 
    public void creerCours()
    {
        Connection c = SqliteJDBC.connecter();
        Statement stmt = null;
        try {

            stmt = c.createStatement();
            String sql = "INSERT INTO Cours (cours,group_id,Lien)VALUES ( \"" + this.cours + "\" ," + this.group_id + ",\"" + this.link + "\");"; 
            c.setAutoCommit(false);
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

    @Override
    public String toString() {
        return "Cours{" + "group_id=" + group_id + ", cours=" + cours + ", link=" + link + '}';
    }
    
}
