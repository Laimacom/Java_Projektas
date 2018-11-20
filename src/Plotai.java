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
	
			double ats = trikampioPlotas(krastine1, krastine2);
			System.out.println("Trikampio plotas: " + ats);
			
		} else if (skaicius == 2) {
			System.out.println("Iveskite staciakampio ilgi: ");
			int ilgis = reader.nextInt();
			System.out.println("Iveskite staciakampio ploti: ");
			int plotis = reader.nextInt();
			
			double ats = staciakampioPlotas(ilgis, plotis);
			System.out.println("Staciakampio plotas: " + ats);	
			
		} else if (skaicius == 3) {
			System.out.println("Iveskite apskritimo spinduli: ");
			double r = reader.nextInt();
			
			double ats = apskritimoPlotas(r);
			System.out.println("Apskritimo plotas: " + ats);
			
		} else {
			System.out.println("Tokio pasirinkimo nera. Nurodytas neteisingas skaicius");
		}
		
		reader.close();
	}
		
	private static int trikampioPlotas(int a, int b) {
		int plotas = 0;
		plotas = (a * b)/2;	
		return plotas;
	}
	
	private static int staciakampioPlotas(int a, int b) {
		int plotas = 0;
		plotas = a * b;	
		return plotas;
	}
	private static double apskritimoPlotas(double a) {
		double plotas = 0;
		plotas = Math.pow(a, 2)*Math.PI;	
		return plotas;
	}
}
