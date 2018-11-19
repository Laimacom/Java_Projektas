package Masyvai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SurikiuotiMasyvai {

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
		System.out.println("Masyvas");
		for(i = 0; i < masyvas.length; i++){
			System.out.println(masyvas[i]);
		}
		
		for(i = 0; i < masyvas.length; i++){
			for(int j = i + 1; j < masyvas.length; j++){
				int sk1 = masyvas[i];
				int sk2 = masyvas[j];
				if(sk1 < sk2){
					masyvas[j] = sk1;
					masyvas[i] = sk2;
				}				
			}
		}
		
		System.out.println("Mazejimo tvarka");
		for(i = 0; i < masyvas.length; i++){
			System.out.println(masyvas[i]);
		}
		for(i = 0; i < masyvas.length; i++){
			for(int j = i + 1; j < masyvas.length; j++){
				int sk1 = masyvas[i];
				int sk2 = masyvas[j];
				if(sk1 > sk2){
					masyvas[j] = sk1;
					masyvas[i] = sk2;
				}				
			}
		}
		
		System.out.println("Didejimo tvarka");
		for(i = 0; i < masyvas.length; i++){
			System.out.println(masyvas[i]);
		}
		
		
		br.close();
	}

}
