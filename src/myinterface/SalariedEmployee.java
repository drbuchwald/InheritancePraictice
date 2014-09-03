/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;




/**
 *
 * @author Dan
 */
public class SalariedEmployee implements Employee {
    
    private double salary;
    
    private String firstName;
    private String lastName;
    private String idNumber;
       
  
    
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    @Override
    public double getWages(){         
               
        return salary;
    }
    
}
