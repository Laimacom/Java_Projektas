package PagrinduUzdaviniai;

import java.util.Scanner;

public class AntroTrecias {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double suma = 0;
		for(int i =0; i < 5; i++ ){
			System.out.println("Pazymiai ");
			int pazymiai = reader.nextInt();
			suma += pazymiai; 
		}
		double vidurkis = suma /5;
		if (vidurkis > 9) {
			System.out.println("Petriukas gaus tris saldainius.");
		} else if (vidurkis <+ 9 & vidurkis >= 7){
			System.out.println("Petriukas gaus du saldainius.");
		} else {
			System.out.println("Petriukas gaus viena saldaini.");
		}
		reader.close();
	}

}
