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
public class SalaryPlusComissionEmployee extends Employee {

    private double salary;
    private double commission;
    private double totalPay;

    @Override
    public double getWages() {
        if (commission > 0) {
            totalPay = salary + commission;
        }
        return totalPay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getComission() {
        return commission;
    }

    public void setComission(double comission) {
        this.commission = comission;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }
}
