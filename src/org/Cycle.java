/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

/**
 *
 * @author jridi
 */
public class Cycle {
    private static int cycle_id;
    private static String cycle;

    public static int getCycle_id() {
        return cycle_id;
    }

    public static void setCycle_id(int cycle_id) {
        Cycle.cycle_id = cycle_id;
    }

    public static String getCycle() {
        return cycle;
    }

    public static void setCycle(String cycle) {
        Cycle.cycle = cycle;
    }
    
    
}
