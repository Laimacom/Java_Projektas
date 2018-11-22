package PagrinduUzdaviniai;

import java.util.Scanner;

public class PirmoAntras {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Kiek zuvu yra: ");
		int a = reader.nextInt();
		System.out.println("Kiek zuvu ideta: ");
		int b = reader.nextInt();
		System.out.println("Kiek dienu: ");
		int c = reader.nextInt();
		
		int rezultatas = a +(b*c);
		System.out.println("Po " + c + " dienu akvariume gyvens " + rezultatas + " zuvu");
		
		reader.close();

	}

}
