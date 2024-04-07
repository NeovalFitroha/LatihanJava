/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class LatArray1 {
    public static void main(String[] args)
    {
        int i;
        int[] nil_Akhir;
        // Deklarasi Variabel Array
        nil_Akhir= new int[6]; //Membuat Objek Array
        Scanner input = new Scanner(System.in);
        for (i=0; i<6; i++)
        {
            System.out.print("Masukkan Array Ke"+i+"=");
                    nil_Akhir[1]=input.nextInt();
        }
        System.out.println("\n\nData yang diinput ke Elemen Array\n");
        for (i=0; i<6; i++)
        {
        System.out.print("Nilai Akhir Indeks"+i);
            System.out.println("="+nil_Akhir[i]);
                
        }
    }
    
}
