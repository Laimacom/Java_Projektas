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
		String st;
		while ((st = br.readLine()) != null) {
			String fileName = "src\\ciklai\\Irase.txt";
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(st);
			System.out.println("Done");
			bw.close();
			fw.close();
		}
		
	br.close();
	}
}
