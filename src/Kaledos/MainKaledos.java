package Kaledos;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

public class MainKaledos {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		
		ElfuSandelisSkaiciavimai elfuSandelisSpausdinimas = new ElfuSandelisSkaiciavimai();
		List<ElfuSandelis> elfuSandelis = elfuSandelisSpausdinimas.getElfuSandelis();
		System.out.println(elfuSandelis);
		
		VaikuNoraiSkaiciavimai vaikuNoraiSkaiciavimai = new VaikuNoraiSkaiciavimai();
		List<VaikuNorai> vaikuNorai = vaikuNoraiSkaiciavimai.getVaikuNorai();
		System.out.println(vaikuNorai);
		
		VaikoCharakteristikaSkaiciavimai vaikoCharakteristikaSkaiciavimai = new VaikoCharakteristikaSkaiciavimai();
		List<VaikoCharakteristika> vaikoCharakteristika = vaikoCharakteristikaSkaiciavimai.getVaikoCharakteristika();
		System.out.println(vaikoCharakteristika);
		
		
	}
	
}
