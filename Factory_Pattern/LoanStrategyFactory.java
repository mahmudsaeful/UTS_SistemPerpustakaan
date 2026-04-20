/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Pattern;

import Strategy_Pattern.*;        
/**
 *
 * @author user
 */
public class LoanStrategyFactory {
    public static LoanStrategy create(String type) {

        switch(type.toLowerCase()) {

            case "mahasiswa":
                return new StudentLoanStrategy();

            case "dosen":
                return new LecturerLoanStrategy();

            case "umum":
                return new PublicLoanStrategy();

            default:
                throw new IllegalArgumentException("Jenis anggota tidak dikenal");
        }
    }
}
