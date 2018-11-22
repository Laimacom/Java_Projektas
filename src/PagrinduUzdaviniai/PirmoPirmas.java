package PagrinduUzdaviniai;
import java.util.Scanner;

public class PirmoPirmas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int suma = 0;
		int minutes = 0;
		String[] dienos = {"pirmadieni", "antradieni", "treciadieni", "ketvirtadieni", "penktadieni"};
		for(int i =0; i < 5; i++ ){
			System.out.println("Kiek pamoku "+ dienos[i]+ ": ");
			int pamokuSk = reader.nextInt();
			suma += pamokuSk; 
		}
		System.out.println("Pamoku skaicius: " + suma);
		minutes = suma * 45;
		System.out.println("Tai sudaro minuciu: " + minutes);
		reader.close();
	}
}




