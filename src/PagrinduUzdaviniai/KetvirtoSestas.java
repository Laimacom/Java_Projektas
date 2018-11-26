package PagrinduUzdaviniai;

import java.util.Scanner;

public class KetvirtoSestas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Suma - 1");
		System.out.println("Atimtis - 2");
		System.out.println("Daugyba - 3");
		System.out.println("Didziausias - 4");
		System.out.println("Maziausias - 5");
		System.out.println("Baigti darba - 6");
		
		System.out.println("Pasirinkite, kuri veiksma norite atlikti (nurodykite skaiciu): ");
		
		boolean testi = true;
		while (testi) {
		double skaicius = reader.nextDouble();
		if (skaicius == 1) {
			
			System.out.println("Iveskite duomenis: ");
				int reiksme = reader.nextInt();
				if (reiksme == 0) {
					break;
				} else {
					int[] masyvas = new int [100];
					for (int i=0; i < masyvas.length; i++) {
						masyvas[i] = reader.nextInt();
						}
					double suma = 0;
					for (int i=0; i < masyvas.length; i++) {
						suma += masyvas[i];
						} 
					System.out.println("Suma: " + suma);
				}
				/*int duomenuKiekis = 0;
		        while (reader.hasNextInt()) {
		            reader.nextInt();
		            duomenuKiekis++;
		        }
		        reader.close();*/
		       
			/*int[] masyvas = new int [duomenuKiekis];
			for (int i=0; i < masyvas.length; i++) {
				masyvas[i] = reader.nextInt();
			}
			double suma = 0;
			for (int i=0; i < masyvas.length; i++) {
				suma += masyvas[i];
				} 
			System.out.println("Suma: " + suma);*/
	
			
		} else if (skaicius == 2) {
			System.out.println("Iveskite pirma daugikli: ");
			double daugiklis1 = reader.nextDouble();
			System.out.println("Iveskite antra daugikli: ");
			double daugiklis2 = reader.nextDouble();
			double sandauga = daugiklis1 * daugiklis2;
			System.out.println("Suma: " + sandauga);		
		} else if (skaicius == 3) {
			System.out.println("Iveskite dalini: ");
			double dalinys = reader.nextDouble();
			System.out.println("Iveskite dalikli: ");
			double daliklis = reader.nextDouble();
			double dalmuo = dalinys / daliklis;
			System.out.println("Suma: " + dalmuo);					
		} else if (skaicius == 4) {
			System.out.println("Iveskite turinys: ");
			double turinys = reader.nextDouble();
			System.out.println("Iveskite ateminys: ");
			double ateminys = reader.nextDouble();
			double skirtumas = turinys /ateminys;
			System.out.println("Suma: " + skirtumas);					
		} else if (skaicius == 5) {
			System.out.println("Isejimas");
			break;
		} else {
			System.out.println("Tokio pasirinkimo nera. Nurodytas neteisingas skaicius");
		}
	}
		
		reader.close();

	}

}
