package PagrinduUzdaviniai;

import java.util.Scanner;

public class TrecioSestas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Kiek kauliuku ");
		int sk = reader.nextInt();
		int max = sk*6;
		
		
		int[] masyvas = new int [sk];
		//int a = reader.nextInt();
		//if ( reader.nextInt() <= 6) {
		for (int i=0; i < sk; i++) {
			int number = i+1;
			System.out.println("Iveskite " + number + "-o kauliuko taðkø kieki:");
			masyvas[i] = reader.nextInt();
		}
		reader.close();
		System.out.println("Ið viso buvo galima surinkti taðkø: " + max);
		double taskai = taskuSuma(masyvas);
		System.out.println("Tomas ið viso surinko: " + taskai);
		double vid = taskuSuma(masyvas)/sk;
		System.out.println("Jo taðkø vidurkis: " + vid);
		double puse = max/2;
		if (taskai > puse) {
			System.out.println("Loterija laimeta.");
		} else {
			System.out.println("Loterija pralaimeta.");
		}
		//} else {
			System.out.println("Negalimas tasku kiekis!");
		//}
	}
	
	private static double taskuSuma(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}		
		return sum;
	}
}

