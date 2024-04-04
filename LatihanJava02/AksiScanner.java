
package masukkan;
import java.util.Scanner;

public class AksiScanner {
    public static void main (String args[]) 
    {
        //Membuat Objek Baru
        ClassScanner scan=new ClassScanner();
        
        scan.inputScanner();
        System.out.println("\nNama Anda :" + scan.getnama());
        System.out.println("Nilai Anda :" + scan.rata());
        
    }
       
}
