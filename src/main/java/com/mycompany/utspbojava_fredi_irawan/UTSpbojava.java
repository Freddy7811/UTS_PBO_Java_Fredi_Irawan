/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utspbojava_fredi_irawan;

/**
 *
 * @author A-24
 */

import java.util.Scanner;

public class UTSpbojava {
    public static void main(String[] args) {
        // Tampilan pembatas
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // Tampilan nama dan NIM
        System.out.println("UTS 20 Mei 2024 oleh Fredi Irawan NIM: 23201276");
        // Tampilan pembatas
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        

        // Meminta pengguna memasukkan nama
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nama: ");
        String nama = scanner.nextLine();

        // Meminta pengguna memilih jenis kelamin
        System.out.println("Pilih jenis kelamin:");
        System.out.println("(1) Laki-laki");
        System.out.println("(2) Perempuan");
        int jenisKelamin = scanner.nextInt();

        // Menentukan panggilan berdasarkan jenis kelamin
        String panggilan;
        if (jenisKelamin == 1) {
            panggilan = "Mas";
        } else {
            panggilan = "Mbak";
        }

        // Menampilkan selamat datang
        System.out.println("Selamat Datang, " + panggilan + " " + nama);

        // Menampilkan kalkulator
        System.out.println("Kalkulator");

        // DFredieklarasi Variabel
        boolean running = true;
        while (running) {
            // input bilangan 1
            System.out.println("Masukkan bilangan 1: ");
            int angka1 = scanner.nextInt();
           
            //input bilangan 2
            System.out.println("Masukkan bilangan 2: ");
            int angka2 = scanner.nextInt();
            
             //input operator matematika
            System.out.println("Masukkan operator (+, -, *, /): ");
            scanner.nextLine();
            String operator = scanner.nextLine();

            
            // Hasil disimpan dalam variabel
            double hasil;
            hasil = 0;
            boolean validOperator = true;

            // Menghitung sesuai operator
            switch (operator) {
                case "+":
                    hasil = angka1 + angka2;
                    break;
                case "-":
                    hasil = angka1 - angka2;
                    break;
                case "*":
                    hasil = angka1 * angka2;
                    break;
                case "/":
                    hasil = angka1 / angka2;
                    break;
                default:
                    System.out.println("Operator tidak valid. Pilih operator yang valid.");
                    validOperator = false;
            }

            //  hasil perhitungan
            if (validOperator) {
                System.out.println("Hasil: " + hasil);
            }

            //Tampilkan apakah ingin melanjutkan atau keluar
            System.out.println("Apakah Anda ingin melanjutkan? (y/n): ");
            String lanjut = scanner.nextLine();

            if (lanjut.equalsIgnoreCase("n")) {
                running = false;
            }
        }

        // Menampilkan pesan keluar
        System.out.println("Thank you for using the calculator. Goodbye!");

        scanner.close();
    }
}