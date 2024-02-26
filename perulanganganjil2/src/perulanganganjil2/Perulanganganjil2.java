/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulanganganjil2;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Scanner;

public class Perulanganganjil2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan batas awal dan batas akhir
        System.out.println("Masukkan batas awal:");
        int batasAwal = scanner.nextInt();
        System.out.println("Masukkan batas akhir:");
        int batasAkhir = scanner.nextInt();

        // Memeriksa apakah batas awal lebih kecil dari atau sama dengan batas akhir
        if (batasAwal > batasAkhir) {
            System.out.println("Input tidak valid, batas awal harus lebih kecil dari atau sama dengan batas akhir");
            return;
        }

        // Menghitung banyaknya bilangan ganjil dari batasAwal hingga batasAkhir
        int banyakGanjil = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                banyakGanjil++;
            }
        }

        // Menampilkan hasil
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah: " + banyakGanjil);
    }
}
