package PagrinduUzdaviniai;

import java.util.Scanner;

public class AntroAntras {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Kiek sveria varle: ");
		int svoris = reader.nextInt();
		System.out.println("Kiek varliu norima stebeti: ");
		int varles = reader.nextInt();
		
		int bendrasSvoris = svoris * varles;
		if (bendrasSvoris >= 5000) {
		System.out.println("Varliu stebejimui pakanka.");
	} else {
		System.out.println("Varliu stebejimui nepakanka.");
		}
		reader.close();
	}
}
