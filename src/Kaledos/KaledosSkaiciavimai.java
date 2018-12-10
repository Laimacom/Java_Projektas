package Kaledos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class KaledosSkaiciavimai {
	
	public List<ElfuSandelis> getElfuSandelis() throws FileNotFoundException {
		List<ElfuSandelis> zaislaiSandely = new LinkedList<>();
		String filePath = "src\\Kaledos\\ElfuSandelis.txt";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()){
			ElfuSandelis zaislai = new ElfuSandelis();
			zaislai.setZaislas(scanner.nextLine());
			
			//.split(",");
			//zaislai.setKiekis(scanner.nextInt());

			zaislaiSandely.add(zaislai);
		}
		scanner.close();

		return zaislaiSandely;
	}
}
