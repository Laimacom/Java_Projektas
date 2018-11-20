import java.util.Scanner;

public class LyginisNelyginis {
	
	public static void main(String[] args) { 
		System.out.println("Iveskite sveika skaiciu:");
		Scanner reader= new Scanner(System.in);
		int sk= reader.nextInt();
		
		lyginisNelyginisSprendimas(sk);
		
		reader.close();
		}
	
	private static void lyginisNelyginisSprendimas(int a) {
		
	         if (a % 2 == 0) {
	        	 System.out.println("Lyginis"); 
	         } else {
	        	 System.out.println("Nelyginis"); 
	         }
	  	}
}

