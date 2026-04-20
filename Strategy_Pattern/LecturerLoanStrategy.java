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
public class LecturerLoanStrategy implements LoanStrategy {

    public int getMaxDays() {
        return 14;
    }

    public double calculateFine(int daysLate) {
        return daysLate * 500;
    }

    public String getMemberType() {
        return "Dosen";
    }
}
