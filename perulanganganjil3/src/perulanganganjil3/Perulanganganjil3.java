/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulanganganjil3;

/**
 *
 * @author Irfan Habibi
 */
import java.util.Scanner;

public class Perulanganganjil3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai n
        System.out.println("Masukkan nilai n (n >= 0):");
        int n = scanner.nextInt();

        // Memeriksa apakah n >= 0
        if (n < 0) {
            System.out.println("Input tidak valid, n harus lebih besar dari atau sama dengan 0");
            return;
        }

        // Menghitung faktorial n
        int faktorial = 1;
        String faktorialString = "";
        for (int i = n; i > 0; i--) {
            faktorial *= i;
            faktorialString += i;
            if (i != 1) {
                faktorialString += "*";
            }
        }

        // Menampilkan hasil
        System.out.println(n + "! = " + faktorialString + " = " + faktorial);
    }
}
