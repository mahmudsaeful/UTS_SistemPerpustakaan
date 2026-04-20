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
public interface LoanStrategy {
    int getMaxDays();
    double calculateFine(int daysLate);
    String getMemberType();
}