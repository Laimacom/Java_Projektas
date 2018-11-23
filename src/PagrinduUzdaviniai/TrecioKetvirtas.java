package PagrinduUzdaviniai;

import java.util.Scanner;

public class TrecioKetvirtas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Kiek egluciu ");
		int sk = reader.nextInt();
		System.out.println("Egluciu aukstis ");
		
		int[] masyvas = new int [sk];
		for (int i=0; i < masyvas.length; i++) {
			masyvas[i] = reader.nextInt();
		}
		reader.close();
		
		double suma = 0;
		double vidurkis = 0;
		for (int i=0; i < masyvas.length; i++) {
			suma += masyvas[i];
			vidurkis = suma / masyvas.length;
			} 
		System.out.println("Egluciu aukscio vidurkis: " + vidurkis);
			
	}

}
