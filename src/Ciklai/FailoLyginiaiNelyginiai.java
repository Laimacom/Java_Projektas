package Ciklai;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FailoLyginiaiNelyginiai {
	
	public static void main(String[] args) throws IOException {
		String filePath = "src\\ciklai\\Nuskaite.txt";
		File file = new File(filePath); 
		BufferedReader br = new BufferedReader(new FileReader(file));
		String skaiciai = br.readLine();
		
		int i = 0;
		while (i < skaiciai.length()) {
			int sk = 0;
			if ( sk % 2 == 0) {
				String fileName = "src\\ciklai\\RezultatasLyginisNelyginis.txt";
				FileWriter fw = new FileWriter(fileName);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(String.valueOf(skaiciai + "lyginis"));
				bw.close();
				fw.close();
		        } else {
		        	String fileName = "src\\ciklai\\RezultatasLyginisNelyginis.txt";
					FileWriter fw = new FileWriter(fileName);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(String.valueOf(skaiciai + "nelyginis"));
					bw.close();
					fw.close();
		        }
			i++;
		}
		br.close();
	}

}
