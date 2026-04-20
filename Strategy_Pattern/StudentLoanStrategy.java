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
public class StudentLoanStrategy implements LoanStrategy {

    public int getMaxDays() {
        return 7;
    }

    public double calculateFine(int daysLate) {
        return daysLate * 1000;
    }

    public String getMemberType() {
        return "Mahasiswa";
    }
}