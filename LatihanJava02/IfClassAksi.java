
package KondisiIf;
import java.util.Scanner;

public class IfClassAksi {
    public static void main (String [] args)
    {
        double tot_beli;
        Scanner input = new Scanner (System.in);
        IfClass fungsiif=new IfClass();
        
        System.out.println("Total Pembelian Rp. ");
        fungsiif.TotBeli = input.nextDouble();
        
        System.out.println("Besaarnya potongan Rp. "+fungsiif.getPotongan());
        System.out.println("Jumlah yang harus dibayarkan Rp. "+fungsiif.JumlahBayar());
        
    }
}
