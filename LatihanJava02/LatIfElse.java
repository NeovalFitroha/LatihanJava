/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KondisiIfElse;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class LatIfElse {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        String keterangan,nama;
        int nilai;
        
        System.out.println("Masukkan Nama Siswa : ");
        nama = input.nextLine();
        System.out.println("Masukkan Nilai Akhir");
        nilai = input.nextInt();
        if (nilai >= 70){
            // Perintah Jika Kondisi True
            keterangan = "Lulus";
        }else{
            //Perintah Jika Kondisi False
            keterangan = "Gagal/Tidak Lolos";   
        }
        System.out.println("Hasil Akhir");
        System.out.println("==================================");
        System.out.println("Nama Siswa                  :"+nama);
        System.out.println("Nilai Akhir Yang Didapat    :"+nilai);
        System.out.println("Keterangan                  :"+keterangan);
        System.out.println("==================================");
    }
}
