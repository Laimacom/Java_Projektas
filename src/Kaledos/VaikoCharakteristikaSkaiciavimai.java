package Kaledos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VaikoCharakteristikaSkaiciavimai {
	
	private static final int CHILD_NAME = 0;
	private static final int CHILD_SURNAME = 1;
	private static final int CHARACTER = 2;
	
	public List<VaikoCharakteristika> getVaikoCharakteristika() throws FileNotFoundException {
		
		List<VaikoCharakteristika> vaikoCharakteristika = new LinkedList<>();
		String filePath = "src\\Kaledos\\VaikoCharakteristika.txt";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()){
			VaikoCharakteristika charakteristika = new VaikoCharakteristika();
			String fileLine = scanner.nextLine();
			String[] data = fileLine.split(",");
			
			charakteristika.setVardas(data[CHILD_NAME]);
			charakteristika.setPavarde(data[CHILD_SURNAME]);
			charakteristika.setCharakteristika(data[CHARACTER]);	
			
			vaikoCharakteristika.add(charakteristika);
		}
		scanner.close();

		return vaikoCharakteristika;
	}
	
	public void gerasBlogas(List<VaikoCharakteristika> vaikoCharakteristika) {
	
		System.out.println(vaikoCharakteristika.get(CHARACTER));
//		if (vaikoCharakteristika.get(CHARACTER) == "Geras") {
//			
//		}
	}
	
}
