package Princai;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrincaiMain {

	public static void main(String[] args) throws IOException {
	
		nuskaitytiIsFailo();
	}
	private static void nuskaitytiIsFailo() throws IOException{
		String kelias = "src\\Princai\\Princai_duom.txt";
		File failas = new File(kelias);
		Scanner skaneris = new Scanner(failas);
		
		int kiekis = skaneris.nextInt();
		
		Princai[] masyvas = new Princai[kiekis]; //  kuriamas objektas
		for(int i = 0; i < kiekis; i++){
			Princai princai = new Princai();   //kuriamas objektas
			String vardas = skaneris.next();
			String pavarde = skaneris.next();
			int pedos = skaneris.nextInt();
			int coliai = skaneris.nextInt();
			princai.setVardas(vardas); 
			princai.setPavarde(pavarde); 
			princai.setPedos(pedos); 
			princai.setColiai(coliai); 
			masyvas[i] = princai;
			System.out.println(princai); 
		}
		skaneris.close();
	}

}
