
import java.util.Scanner;

public class Trikampis {
	
	 public static void main(String args[]){   
	       
	      Scanner reader= new Scanner(System.in);
	        
	         System.out.println("Iveskite pirmos krastines ilgi: ");
	         double krastine1= reader.nextDouble();
	 
	         System.out.println("Iveskite antros krastines ilgi: ");
	         double krastine2= reader.nextDouble();
	 
	         double plotas=(krastine1*krastine2)/2;
	      
	         System.out.println("Trikampio plotas: " + plotas);  
	         
	      reader.close();
	   }
	
}
