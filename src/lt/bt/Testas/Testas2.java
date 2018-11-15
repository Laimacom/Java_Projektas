package lt.bt.Testas;

import java.util.Scanner;

public class Testas2 {

	public static void main(String[] args) {
		
		 Scanner reader= new Scanner(System.in);
         System.out.println("Iveskite gimimo metus:");
         double data= reader.nextDouble();
         double metai=2018 - data ;
         
         System.out.println("Jums yra: " + metai + "metu");  
         if (metai >= 18) {
        	 System.out.println("Pilnametis");
         }
        	 else {
        		 System.out.println("Nepilnametis");
        	 }
         reader.close();

	}

}
