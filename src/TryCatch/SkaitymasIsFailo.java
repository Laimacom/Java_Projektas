package TryCatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SkaitymasIsFailo {

	public static void main(String[] args) {
		printText("Iveskite failo kelia ");
		skaitymas();
	}
		
	 private static void printText(String text){
	        System.out.println(text);
	    }
	 
	 private static String nuskaitytiIsKonsoles() {		
			@SuppressWarnings("resource")
			Scanner reader = new Scanner(System.in);
			String el = reader.nextLine();
			return el;
		}
	 
	 private static void skaitymas(){
		 BufferedReader br = null;
			try{
				String filePath = nuskaitytiIsKonsoles();
				File file = new File(filePath);
				br = new BufferedReader(new FileReader(file));
				String st;
				while ((st = br.readLine()) != null) {
					printText(st);
				}			
			} catch (IOException e){
				printText("Failas nerastas. Iveskite failo pavadinima su keliu ");
				skaitymas();
			} 
		}
}

