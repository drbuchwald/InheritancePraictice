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
public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private int wage;
    private final static double OVERTIME = 1.5;

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

}
