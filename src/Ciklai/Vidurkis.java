package Ciklai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Vidurkis {
	
	public static void main(String[] args) throws IOException {
		String filePath = "src\\ciklai\\Nuskaite.txt";
		File file = new File(filePath); 
		BufferedReader br = new BufferedReader(new FileReader(file));
		String skaiciai = br.readLine();
		
		double suma = 0;
		int i = 0;
		while (i < skaiciai.length()) {
			suma += Integer.parseInt(String.valueOf(skaiciai.charAt(i)));
			i++;
		}
		
		double vidurkis = suma/skaiciai.length();
		
		String fileName = "src\\ciklai\\RezultatasVidurkis.txt";
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(String.valueOf(vidurkis));
		bw.close();
		fw.close();
		br.close();
	}
}

