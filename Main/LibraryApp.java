package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Book;
import Model.Member;
import Factory_Pattern.*;
import Strategy_Pattern.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class LibraryApp {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Book> books = new ArrayList<>();

        books.add(new Book("Java Programming"));
        books.add(new Book("Design Pattern"));
        books.add(new Book("Cyber Security Basic"));
        books.add(new Book("Database System"));

        System.out.println("=================================");
        System.out.println("      SISTEM PERPUSTAKAAN");
        System.out.println("=================================");

        System.out.print("Masukkan nama: ");
        String name = input.nextLine();

        System.out.println("\nPilih jenis anggota:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.println("3. Umum");

        System.out.print("Pilihan: ");
        int choice = input.nextInt();

        String type = "";

        switch(choice) {

            case 1: type = "mahasiswa"; break;
            case 2: type = "dosen"; break;
            case 3: type = "umum"; break;

            default:
                System.out.println("Pilihan tidak valid");
                return;
        }

        LoanStrategy strategy = LoanStrategyFactory.create(type);

        Member member = new Member(name, strategy);

        System.out.println("\n===== DAFTAR BUKU =====");

        for(int i=0; i<books.size(); i++) {

            System.out.println((i+1) + ". " + books.get(i).getTitle());
        }

        System.out.print("\nPilih buku: ");
        int bookChoice = input.nextInt();

        Book selectedBook = books.get(bookChoice-1);

        member.borrowBook(selectedBook);

        System.out.print("\nMasukkan jumlah hari keterlambatan: ");
        int late = input.nextInt();

        member.returnBook(selectedBook, late);

        System.out.println("\nTerima kasih telah menggunakan sistem!");
    }
}