/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;






/**
 *
 * @author Dan
 */
public class SalariedEmployee extends Employee {
    
    private double salary;
    
    @Override
    public double getWages(){         
               
        return salary;
    }
    
}
