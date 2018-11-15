package Ciklai;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
        System.out.println("Iveskite sveika skaiciu:");
		int sk = reader.nextInt();
				switch (sk) {
				case 1:
					System.out.println("Vienas");
				case 2:
					System.out.println("Du");
				case 3:
					System.out.println("Trys");
					break;
				default:
			System.out.println("Nezinomas skaicius");
			}
		reader.close();
	}
}
