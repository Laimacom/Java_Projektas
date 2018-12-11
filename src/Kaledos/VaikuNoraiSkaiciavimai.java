package Kaledos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VaikuNoraiSkaiciavimai {

	private static final int CHILD_NAME = 0;
	private static final int CHILD_SURNAME = 1;
	private static final int AGE = 2;
	private static final int ADDRESS = 3;
	private static final int WISH = 4;
	
	
	public List<VaikuNorai> getVaikuNorai() throws FileNotFoundException {
		List<VaikuNorai> vaikuNorai = new LinkedList<>();
		String filePath = "src\\Kaledos\\VaikuNorai.txt";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()){
			
			String fileLine = scanner.nextLine();
			String[] data = fileLine.split(",");
			VaikuNorai norai = new VaikuNorai();
			
			if (Integer.parseInt(data[AGE].trim()) < 15) {
			norai.setVardas(data[CHILD_NAME]);
			norai.setPavarde(data[CHILD_SURNAME]);
			norai.setAmzius(Integer.parseInt(data[AGE].trim()));	
			norai.setAdresas(data[ADDRESS]);
			norai.setNoras(data[WISH]);
			vaikuNorai.add(norai);
			}
			
		}
		scanner.close();
		return vaikuNorai;
	}
	
	public void vaikoAmzius(List<VaikuNorai> vaikuNorai) {
		
		
	}
}
