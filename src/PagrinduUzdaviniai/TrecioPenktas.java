package PagrinduUzdaviniai;

import java.util.Scanner;

public class TrecioPenktas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite skaicius ");
		
		int[] masyvas = new int [10];
		for (int i=0; i < 10; i++) {
			masyvas[i] = reader.nextInt();
		}
		//Pasitikrinau, ar sudejo i masyva
		//System.out.println("Masyvas");
		//for(int i = 0; i < masyvas.length; i++){
			//System.out.println(masyvas[i]);
		//}
		int kiekis = 0;
		for (int i=0; i < masyvas.length; i++) {
			if ( masyvas[i] % 2 == 0) {
			kiekis++;
			} 
			
		}
			
		if (kiekis != 0) {
			System.out.println("Atsakymas: " + kiekis);
		} else {
			System.out.println("Atsakymas: Nera");
		}	
		
	}
}
	

