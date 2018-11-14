
import java.util.Scanner;

public class Apskritimas {
	public static void main(String[] args) { 
	       
	      Scanner reader= new Scanner(System.in);
	         System.out.println("Iveskite apskritimo spinduli:");
	         double r= reader.nextDouble();
	         double plotas=(22*r*r)/7 ;
	         System.out.println("Apskritimo plotas: " + plotas);  
	         reader.close();
	   }
}
