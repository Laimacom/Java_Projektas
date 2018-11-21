package lt.bt.Testas;

import java.util.Scanner;

public class Uzduotis5 {

	public static void main(String[] args) {
		int[] masyvas = {3,4,5,7,4,22,11,3,5,6,6};
		printText("Iveskite skaiciu: ");
		int n = nuskaitytiIsKonsoles();
		int kiekis = kiekKartuSkaicius(masyvas, n);
		printText("Skaicius " + n + "rastas " + kiekis);
		
	}
	
	public static int kiekKartuSkaicius(int[] array, int n) {
		int kiekis = 0;
		for(int i = 0; i < array.length; i++){
			 if(n ==  array[i]) {
	                kiekis++;
			 		}
		 }
		return kiekis;
	}
	private static void printText(String text){
        System.out.println(text);
    }
	private static int nuskaitytiIsKonsoles() {		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		return n;
	}

}
