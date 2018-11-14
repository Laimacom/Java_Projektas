
import java.util.Scanner;

public class Keturkampis {
	
	public static void main(String args[]){   
	       
	      Scanner reader= new Scanner(System.in);
	        
	         System.out.println("Iveskite pirmos krastines ilgi: ");
	         double krastine1= reader.nextDouble();
	 
	         System.out.println("Iveskite antros krastines ilgi: ");
	         double krastine2= reader.nextDouble();
	 
	         double plotas=krastine1*krastine2;
	      
	         System.out.println("Staciakampio plotas: " + plotas);  
	         
	      reader.close();
	   }
}