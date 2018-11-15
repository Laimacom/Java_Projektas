import java.util.Scanner;

public class LyginisNelyginis {
	public static void main(String[] args) { 
	       
	      Scanner reader= new Scanner(System.in);
	         System.out.println("Iveskite sveika skaiciu:");
	         int sk= reader.nextInt();
	         if (sk % 2 == 0) {
	        	 System.out.println("Lyginis"); 
	         } else {
	        	 System.out.println("Nelyginis"); 
	         }
	         reader.close();
	   }
}

