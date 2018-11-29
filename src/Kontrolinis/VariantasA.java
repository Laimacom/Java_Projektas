package Kontrolinis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class VariantasA {

	public static void main(String[] args) throws IOException{
	try {
		int[] masyvas = nuskaitytiIsFailo();
		
	    int at = marsrutoIlgis(masyvas);
	    int il = ilgiausiasMarsrutas(masyvas);
	    int tr = trumpiausiasMarsrutas(masyvas);
	    
	    saveToFile(at, il, tr);
	    
	} catch (IOException e) {
		System.err.println("Nera failo" );			
		}
	}
	
	private static int marsrutoIlgis(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}		
		return sum;
	}
	
	private static int ilgiausiasMarsrutas(int[] array){
		int sk1 = array[0];
		for(int i = 0; i < array.length; i++){
			if (array[i] > sk1) {
				sk1 = array[i];
				}
		}		
		return sk1;
	}
	
	private static int trumpiausiasMarsrutas(int[] array){
		int sk = array[0];
		for(int i = 0; i < array.length; i++){
			if (array[i] < sk) {
				sk = array[i];
				}
		}		
		return sk;
	}
	
	private static int[] nuskaitytiIsFailo() throws FileNotFoundException{
		String kelias = "src\\Kontrolinis\\DuomenysA.txt";
		File failas = new File(kelias);
		Scanner skaneris = new Scanner(failas);
		int stoteles = skaneris.nextInt();
		int[] masyvas = new int[stoteles];
			for(int i = 0; i < stoteles; i++){
				masyvas[i] = skaneris.nextInt();
			}
		skaneris.close();
		return masyvas;
	}

	private static void saveToFile(int at, int il, int tr) throws IOException {					
		 String fileName = "src\\Kontrolinis\\Rezultatai.txt";
		 	String rezultatas = ("Rezultatu failas: " + "\r\n");
		    String atstumas = ("Marsruto atstumas: " + at + " m" + "\r\n");
		    String ilgiausias = ("Ilgiausias atstumas: " + il + " m" + "\r\n");
		    String trumpiausias = ("Trumpiausias atstumas: " + tr + " m" + "\r\n");
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(rezultatas);
			bw.write(atstumas);
			bw.write(ilgiausias);
			bw.write(trumpiausias);
			System.out.println("Done");
			bw.close();
			fw.close();
	}
}
