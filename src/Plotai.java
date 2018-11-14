import java.util.Scanner;

public class Plotai {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Trikampis - 1");
		System.out.println("Staciakampis - 2");
		System.out.println("Apskritimas - 3");
		System.out.println("Pasirinkite, kurios figuros plota norite skaiciuoti (nurodykite skaiciu): ");
		int skaicius = reader.nextInt();
		
		if (skaicius == 1) {
			System.out.println("Iveskite pirmos krastines ilgi: ");
			int krastine1 = reader.nextInt();
			System.out.println("Iveskite antros krastines ilgi: ");
			int krastine2 = reader.nextInt();
			int trikampioPlotas = (krastine1*krastine2)/2;
			System.out.println("Trikampio plotas: " + trikampioPlotas);
		} else if (skaicius == 2) {
			System.out.println("Iveskite staciakampio ilgi: ");
			int ilgis = reader.nextInt();
			System.out.println("Iveskite staciakampio ploti: ");
			int plotis = reader.nextInt();
			int staciakampioPlotas = ilgis*plotis;
			System.out.println("StaciakampioPlotas: " + staciakampioPlotas);			
		} else if (skaicius == 3) {
			System.out.println("Iveskite apskritimo spinduli: ");
			int r = reader.nextInt();
			double apskritimoPlotas = Math.pow(r, 2)*Math.PI;
			System.out.println("StaciakampioPlotas: " + apskritimoPlotas);				
		} else {
			System.out.println("Tokio pasirinkimo nera. Nurodytas neteisingas skaicius");
		}
		
		reader.close();

	}
}
