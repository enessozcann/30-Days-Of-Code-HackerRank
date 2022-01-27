import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day0_Hello_World{
	public static void main(String[] args) {
        // Stdin'den girdi okumak için Scanner oluşturma.
		Scanner scan = new Scanner(System.in); 
		
		// Stdin'den tam bir girdi satırı okuyun ve değişkenimiz olan ınputString kaydedin.
		String inputString = scan.nextLine(); 

		// Scanner objesini kapatalım. çünkü okumayı bitirdik.
		scan.close(); 
      
		// "Hello, World." diyerek bir dize yazdırdık. Çıktı için.
		System.out.println("Hello, World.");
        System.out.println("Welcome to 30 Days of Code!");
        
      
	    // TODO: Giriş Dizesinin içeriğini stdout'a basan bir kod satırı yazın...
	}
}
