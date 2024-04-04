/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KondisiIf;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class LatIf 
     {
     public static void main (String [] Args)
     {
         
         double tot_beli, potongan =0, jum_bayar=0;
         Scanner input = new Scanner (System.in);
         
         System.out.println("Total Pembelian Rp.:");
         tot_beli = input.nextDouble();
         if (tot_beli >= 50000)
             potongan = 0.2 * tot_beli;
         System.out.println("Besarnya Potongan Rp." +potongan);
         jum_bayar = tot_beli - potongan ;
         System.out.println("Jumlah Yang Harus Dibayarkan Rp. "+jum_bayar);
     }
     
}

