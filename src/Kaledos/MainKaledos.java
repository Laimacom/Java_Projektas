package Kaledos;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

public class MainKaledos {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		KaledosSkaiciavimai kaledosSkaiciavimai = new KaledosSkaiciavimai();
		List<ElfuSandelis> zaislaiSandely = kaledosSkaiciavimai.getElfuSandelis();
		System.out.println(zaislaiSandely);
	}

}
