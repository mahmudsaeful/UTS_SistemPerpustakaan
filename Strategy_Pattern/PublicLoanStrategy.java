/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy_Pattern;

/**
 *
 * @author user
 */
public class PublicLoanStrategy implements LoanStrategy {

    public int getMaxDays() {
        return 5;
    }

    public double calculateFine(int daysLate) {
        return daysLate * 2000;
    }

    public String getMemberType() {
        return "Umum";
    }
}