/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfElseMajemuk;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class IfElseMajemuk {
    public static void main (String [] args) {
        int pendapatan ;
        double jasa,komisi,total;
        // Deklarasi Objek
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Pendapatan Sales Rp. ");
        pendapatan = input.nextInt();
        
        if (pendapatan >=0 && pendapatan <= 20000) {
            jasa = 10000;
            komisi = 0.1*pendapatan;
        }
        else if (pendapatan <= 50000) {
            jasa = 20000;
            komisi = 0.15*pendapatan;
        }
        else {
            jasa = 30000;
            komisi = 0.2*pendapatan;
        }
        /* Menghitung Total */
        total = komisi+jasa;
        System.out.println("\nUang jasa Rp. " +(int) jasa);
        System.out.println("\nUang Komisi Rp. " +(int) komisi);
        System.out.println("===============================");
        System.out.println("\nUang Total Rp. " +(int) total);
        
    }
}
