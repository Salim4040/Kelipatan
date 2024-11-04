/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176040.latihan18.kelipatan;

/**
 *
 * @author BISMILLAH
 * NAMA     : Salim Reza
 * KELAS    : Sistem Informasi
 * NIM      : 23176040
 * Deskripsi Program : Program ini brfungsi untuk mencetak kelipatan 3.5 dari 3.5 hingga 35 
 * menggunakan perulangan.
 */
public class SI23176040Latihan18Kelipatan {
    public static void main(String[] args) {
        // Variabel untuk menyimpan nilai awal dan batas akhir
        double angka = 3.5;
        double batas = 35.0;
        
        // Perulangan untuk mencetak kelipatan 3.5 dari 3.5 hingga 35
        while (angka <= batas) {
            System.out.println(angka);
            angka += 3.5; // Tambahkan 3.5 setiap iterasi
        }
    }
    
}
