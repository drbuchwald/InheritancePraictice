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
public class HourlyEmployee implements Employee {

    private int hoursWorked;
    private int wage;
    private final static double OVERTIME = 1.5;

    private String firstName;
    private String lastName;
    private String idNumber;
    
    
  @Override
    public double getWages() {
        double wagesEarned = 0;
        if (hoursWorked > 40) {
            wagesEarned = ((hoursWorked - 40) * OVERTIME);
        }else{
                wagesEarned = hoursWorked * wage;
        }
        return wagesEarned;
    }


    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
    
    
    
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
}
    
    
    
    
    
  