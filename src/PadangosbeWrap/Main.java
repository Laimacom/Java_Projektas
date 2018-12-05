package PadangosbeWrap;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Padangos ratas = new Padangos();
		Padangos[] padangos = read(ratas);
		System.out.println(ratas);
		paieska(padangos, ratas);
	}
	
	private static String read() throws IOException {
		String kelias = "src\\Padangos\\Duom.txt";
		return kelias;
	}

	private static Padangos[] read(Padangos ratas) throws IOException {
		File file = new File(read());
		Scanner scanner = new Scanner(file);

		int plotis = scanner.nextInt();
		int aukstis = scanner.nextInt();
		String indeksas = scanner.nextLine();

		ratas.setAukstis(aukstis);
		ratas.setPlotis(plotis);
		ratas.setIndeksas(indeksas);

		int arrayNum = scanner.nextInt();
		Padangos[] padang = new Padangos[arrayNum];

		for (int i = 0; i < arrayNum; i++) {
			Padangos padangaSandeliy = new Padangos();
			padangaSandeliy.setPlotis(scanner.nextInt());
			padangaSandeliy.setAukstis(scanner.nextInt());
			padangaSandeliy.setIndeksas(scanner.next());
			padangaSandeliy.setKaina(scanner.nextDouble());
			padang[i] = padangaSandeliy;
		}
		scanner.close();
		return padang;
	}

	private static void paieska(Padangos[] padangos, Padangos ieskomaPadanga) {
		int kiekis = 0;
		double bendraKaina = 0;
		for (int i = 0; i < padangos.length; i++) {
			Padangos sandelioPadanga = padangos[i];
			if (arAtitinka(ieskomaPadanga, sandelioPadanga)) {
				bendraKaina = sandelioPadanga.getKaina() + bendraKaina;
				kiekis++;
			}
		}
		System.out.println("Tinkamu padangu skaicius: "+ kiekis);
		System.out.println("Jos kainuotu: "+ bendraKaina);
	}

	private static boolean arAtitinka(Padangos ieskoma, Padangos turima) {
		boolean atitinka = false;		
		if (ieskoma.getAukstis() == turima.getAukstis() && 
				ieskoma.getPlotis() == turima.getPlotis()
				&& ieskoma.getIndeksas().trim().equals(turima.getIndeksas().trim())) {
			atitinka = true;
		}

		return atitinka;
	}
}
