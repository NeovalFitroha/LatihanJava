
package masukkan;
import java.util.Scanner;

public class LatScanner {
public static void main (String args[])
{
   // Membuat objek baru 
    Scanner input = new Scanner (System.in);
    
    // Deklarasi Variable
    String nama ;
    int n2;
    double n1, n3;
    
    System.out.println("Masukkan Nama Anda : ");
    nama = input.nextLine ();
    System.out.println("Masukkan Nilai 1 : ") ;
    n1 = input.nextDouble();
    System.out.println("Masukkan Nilai 2 : ") ;
    n2 = input.nextInt () ;
    
    n3 = n1 + n2 ;
    System.out.println("\nNama Anda : " + nama) ;
    
    System.out.println("Nilai Anda : " +n3);
    
}
}
