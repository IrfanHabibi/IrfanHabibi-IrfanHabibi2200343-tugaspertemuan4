/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulanganganjil1;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Scanner;

public class Perulanganganjil1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai n
        System.out.println("Masukkan nilai n (n >= 1):");
        int n = scanner.nextInt();

        // Memeriksa apakah n >= 1
        if (n < 1) {
            System.out.println("Input tidak valid, n harus lebih besar dari atau sama dengan 1");
            return;
        }

        // Menampilkan bilangan dari 1 sampai dengan n
        System.out.println("Bilangan dari 1 sampai dengan " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
