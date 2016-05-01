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
public class Exam {
    private int exam_id,group_id;
    private String exam;

    public Exam(int group_id, String exam) {
        this.group_id = group_id;
        this.exam = exam;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    
    public void creerExam()
    {
        Connection c = SqliteJDBC.connecter();
        Statement stmt = null;
        try {

            stmt = c.createStatement();
            String sql = "INSERT INTO Exam (exam,group_id) " +
                         "VALUES ( \"" + this.exam + "\" ," + this.group_id + ");"; 
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
}
