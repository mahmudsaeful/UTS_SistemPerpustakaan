/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Strategy_Pattern.*;
/**
 *
 * @author user
 */
public class Member {
    private String name;
    private LoanStrategy strategy;

    public Member(String name, LoanStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void borrowBook(Book book) {

        if(book.isBorrowed()) {

            System.out.println("\nBuku sedang dipinjam!");

        } else {

            book.borrowBook();

            System.out.println("\n===== STRUK PEMINJAMAN =====");
            System.out.println("Nama : " + name);
            System.out.println("Jenis Anggota : " + strategy.getMemberType());
            System.out.println("Buku : " + book.getTitle());
            System.out.println("Maksimal hari : " + strategy.getMaxDays());
        }
    }

    public void returnBook(Book book, int daysLate) {

        book.returnBook();

        double fine = strategy.calculateFine(daysLate);

        System.out.println("\n===== STRUK PENGEMBALIAN =====");
        System.out.println("Buku : " + book.getTitle());
        System.out.println("Terlambat : " + daysLate + " hari");
        System.out.println("Denda : Rp " + fine);
    }
}
