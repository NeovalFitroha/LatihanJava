/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KondisiIfElse;

/**
 *
 * @author LENOVO
 */
public class IfElseAksi {
    public static void main (String [] args) {
        
        // Pembuatan objek baru dari class ifelseclass.java
        IfElseClass ifclass = new IfElseClass();
        
        ifclass.setInputData();
        ifclass.getKeterangan();
        System.out.println("Hasil Akhir");
        System.out.println("======================================================");
        System.out.println("Nama Siswa                 : "+ifclass.nama);
        System.out.println("Nilai akhir yang di dapat  : "+ifclass.nilaiAkhir);
        System.out.println("Keterangan                 : "+ifclass.getKeterangan());
        System.out.println("======================================================");
        
        
        
    }
}
