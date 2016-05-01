/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static org.SqliteJDBC.connecter;

/**
 *
 * @author jridi
 */
public class Group {
    private int group_id, prof_id;
    private String group;

    public Group(String group, int prof_id) {
        this.group = group;
        this.prof_id = prof_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getProf_id() {
        return prof_id;
    }

    public void setProf_id(int prof_id) {
        this.prof_id = prof_id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
    public ArrayList<Cours> getGroupCours()
    {
        
        ArrayList<Cours> cours_list;
        cours_list = new ArrayList<>();
         Connection c = connecter();
        Statement stmt = null;
        try 
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM cours where group_id = \"" + this.group_id +"\";" );
            while ( rs.next() ) {
                Cours cours = new Cours(rs.getInt("group_id"),rs.getString("cours"),rs.getString("link"));
                cours.setCours_id(rs.getInt("cours_id"));
                cours_list.add(cours);
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
        return cours_list;
    }
    
    public ArrayList<Exam> getGroupExams()
    {
        ArrayList<Exam> exams_list;
        exams_list = new ArrayList<>();
         Connection c = connecter();
        Statement stmt = null;
        try 
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Exam where group_id = \"" + this.group_id +"\";" );
            while ( rs.next() ) {
                Exam exam = new Exam(rs.getInt("group_id"),rs.getString("exam"));
                exam.setExam_id(rs.getInt("exam_id"));
                exams_list.add(exam);
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
        return exams_list;
    }
    
    public void creerGroup()
    {
        Connection c = SqliteJDBC.connecter();
        Statement stmt = null;
        try {

            stmt = c.createStatement();
            String sql = "INSERT INTO Groupe (groupe,prof_id) VALUES ( \"" + this.group + "\" ," + this.prof_id +  ");"; 
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
        return "Group{" + "prof_id=" + prof_id + ", group=" + group + '}';
    }
    
}
