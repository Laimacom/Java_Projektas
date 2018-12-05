package Padangos;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		nuskaitytiPadanga();
		nuskaitytiSandeli();

	}
	private static void nuskaitytiPadanga() throws IOException{
		String kelias = "src\\Padangos\\Duom.txt";
		File failas = new File(kelias);
		Scanner skaneris = new Scanner(failas);
		int plotis = skaneris.nextInt(); //185
		int aukstis = skaneris.nextInt(); //65
		String indeksas = skaneris.next(); //HR13
	
		Padangos[] padangaZmogaus = new Padangos[1]; 
		for(int i = 0; i < 1; i++){
			Padangos padanga = new Padangos();   
			padanga.setPlotis(plotis); 
			padanga.setAukstis(aukstis); 
			padanga.setIndeksas(indeksas); 
			padangaZmogaus[i] = padanga;
			System.out.println(padanga); 
			//return padanga;
		}
		skaneris.close();
	}
	
	private static void nuskaitytiSandeli() throws IOException{
		String kelias = "src\\Padangos\\Duom.txt";
		File failas = new File(kelias);
		Scanner skaneris = new Scanner(failas);
		int plotis = skaneris.nextInt(); //185
		int aukstis = skaneris.nextInt(); //65
		String indeksas = skaneris.next(); //HR13
		
		int kiekis = skaneris.nextInt();//5
		
		Padangos[] sandelis = new Padangos[kiekis]; 
		for(int i = 0; i < kiekis; i++){
			Padangos padangaSandelyje = new Padangos();   
			plotis = skaneris.nextInt(); //185
			aukstis = skaneris.nextInt(); //65
			indeksas = skaneris.next(); //HR13
			padangaSandelyje.setPlotis(plotis); 
			padangaSandelyje.setAukstis(aukstis); 
			padangaSandelyje.setIndeksas(indeksas); 
			padangaSandelyje.setKaina(skaneris.nextDouble()); 
			sandelis[i] = padangaSandelyje;
			System.out.println(padangaSandelyje); 
		}
		skaneris.close();
	}
	//private static int sutampa(int[] array) {
		//int sutampancios = 0;
       // for(int i = 0; i < array.length; i++){
           // if(plotis == padanga.setPlotis(plotis)){
            //    sutampancios++;
           // }
       // }
		//return sutampancios;
	//}

}
