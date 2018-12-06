package Padangos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
	
		System.out.println("Naudojant tarpine klase:");
		RatasWrap ratasWrap = readUsingWrap();
		System.out.println(ratasWrap.getIeskomasRatas());
		paieska(ratasWrap.getTurimiRatai(), ratasWrap.getIeskomasRatas());
	}
	
	private static String read() throws IOException {
		String kelias = "src\\Padangos\\Duom.txt";
		return kelias;
	}

	private static RatasWrap readUsingWrap() throws IOException {
		File file = new File(read());
		Scanner scanner = new Scanner(file);

		int plotis = scanner.nextInt();
		int aukstis = scanner.nextInt();
		String indeksas = scanner.nextLine();
		Padangos padanga = new Padangos();
		padanga.setAukstis(aukstis);
		padanga.setPlotis(plotis);
		padanga.setIndeksas(indeksas);

		int arrayNum = scanner.nextInt();
		//Padangos[] padang = new Padangos[arrayNum];
		List<Padangos> listPadangos = new ArrayList();

		for (int i = 0; i < arrayNum; i++) {
			Padangos padangaSandeliy = new Padangos();
			padangaSandeliy.setPlotis(scanner.nextInt());
			padangaSandeliy.setAukstis(scanner.nextInt());
			padangaSandeliy.setIndeksas(scanner.next());
			padangaSandeliy.setKaina(scanner.nextDouble());
			listPadangos.add(padangaSandeliy);
			//padang[i] = padangaSandeliy;
		}
		scanner.close();
		
		RatasWrap ratasWrap = new RatasWrap();
		ratasWrap.setIeskomasRatas(padanga);
		ratasWrap.setTurimiRatai(listPadangos);

		return ratasWrap;
	}
// Metodas, naudojamas su masyvu
//	private static void paieska(Padangos[] padangos, Padangos ieskomaPadanga) {
//		int kiekis = 0;
//		double bendraKaina = 0;
//		for (int i = 0; i < padangos.length; i++) {
//			Padangos sandelioPadanga = padangos[i];
//			if (arAtitinka(ieskomaPadanga, sandelioPadanga)) {
//				bendraKaina = sandelioPadanga.getKaina() + bendraKaina;
//				kiekis++;
//			}
//		}
//		System.out.println("Tinkamu padangu skaicius: "+ kiekis);
//		System.out.println("Jos kainuotu: "+ bendraKaina);
//	}

	private static boolean arAtitinka(Padangos ieskoma, Padangos turima) {
		boolean atitinka = false;		
		if (ieskoma.getAukstis() == turima.getAukstis() && 
				ieskoma.getPlotis() == turima.getPlotis()
				&& ieskoma.getIndeksas().trim().equals(turima.getIndeksas().trim())) {
			atitinka = true;
		}

		return atitinka;
	}
	
	//metodas, naudojamas su listu
	
	private static void paieska(List<Padangos> turimiRatai, Padangos ieskomaPadanga) {
		int kiekis = 0;
		double bendraKaina = 0;		
		for (Padangos sandelioPadanga : turimiRatai) {			
			if (arAtitinka(ieskomaPadanga, sandelioPadanga)) {
				bendraKaina = sandelioPadanga.getKaina() + bendraKaina;
				kiekis++;
			}
		}
		System.out.println("Tinkamu padangu skaicius: "+ kiekis);
		System.out.println("Jos kainuotu: "+ bendraKaina);
		
	}
}
