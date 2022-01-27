import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Days1_Data_Types {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int i2;
        double d2;
        String s2;

        // Değişkenlerinize bir Integer, Double ve String okuyup kaydedin.
        i2 = scan.nextInt();
        d2 = scan.nextDouble();

        scan.nextLine();
        s2 = scan.nextLine();

        // Her iki tamsayı değişkeninin toplamını yeni bir satıra yazdırın. 
        System.out.println(i + i2);

        // Çift değişkenlerin toplamını yeni bir satıra yazdırın. 
        System.out.println(d + d2);

        /* Dize değişkenlerini yeni bir satıra birleştirin ve yazdırın;
            yukarıdaki 's' değişkeni önce yazdırılmalıdır. */
        System.out.println(s.concat(s2));

        scan.close();
    }
}