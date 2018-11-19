package Masyvai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PasalinaMazesniusVid {

	public static void main(String[] args) throws IOException {
		String filePath = "src\\Masyvai\\Masyvas.txt";
	    File file = new File(filePath);
       	BufferedReader br = new BufferedReader(new FileReader(file));
		String skaiciai;
		int[] masyvas = new int [4];
		int i = 0;
		while ((skaiciai = br.readLine()) != null) {
			masyvas[i] = Integer.parseInt(skaiciai);
			i++;
		}
		double suma = 0;
		for(i = 0; i < masyvas.length; i++){
			suma += masyvas[i];
		}

		double vidurkis = suma/masyvas.length;
		
		//int ilgis = 0;
		int[] naujasmasyvas = new int[4];	
	
		int j = 0;
		for(i = 0; i < masyvas.length; i++){
				if (masyvas[i] > vidurkis) {
				naujasmasyvas[j] = masyvas[i];
					j++;
				}
			}
		for (i = 0; i < naujasmasyvas.length; i++) {
			System.out.println(naujasmasyvas[i]);
		}
		br.close();
	}
}


