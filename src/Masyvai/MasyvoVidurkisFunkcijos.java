package Masyvai;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MasyvoVidurkisFunkcijos {
	public static void main(String[] args) throws IOException {
		
	String kelias = "src\\Masyvai\\Masyvas.txt";
    File failas = new File(kelias);
    Scanner skaneris = new Scanner(failas);
    int skKiekis = 0;
    while (skaneris.hasNextInt()) {
       skaneris.nextInt();
        skKiekis++;
    }
    	skaneris.close();
    
    skaneris = new Scanner(failas);
    int[] masyvas = new int[skKiekis];

    for(int i = 0; i < skKiekis; i++){
        masyvas[i] = skaneris.nextInt();
    }
    skaneris.close();
    	
    spausdinti("Masyvo elementu vidurkis: " + masyvoVidurkis(masyvas));

	}
	
	private static double masyvoSuma(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}		
		return sum;
	}
	private static double masyvoVidurkis(int[] array) {
		double arrayLength = array.length;
		double average = masyvoSuma(array) / arrayLength;
		return average;
	}
	private static void spausdinti(String text){
        System.out.println(text);
    }

}
