import java.util.Scanner;

public class Lygtis {

	public static void main(String[] args) {
	
		System.out.println("Kvadratines lygties formule");
		System.out.println("ax^2 + bx + c = 0");
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Nurodykite skaiciu a:");
		int skA = reader.nextInt();
		System.out.println("Nurodykite skaiciu b:");		
		int skB = reader.nextInt();
		System.out.println("Nurodykite skaiciu c:");		
		int skC = reader.nextInt();
		reader.close();
		
		System.out.println("Kvadratines lygties sprendiniai:");
		double diskriminantas = Math.pow(skB, 2) - (4*skA*skC);
		
		if (diskriminantas < 0) {
			System.out.println("Diskriminantas mazesnis uz 0, todel lygtis realiu sprendiniu neturi");} 
		else if (diskriminantas == 0) {
			double x = (-skB)/(2*skA);
			System.out.println("Sprendinys x:" + x);} 
		else {
			double x1 = ((-skB)-Math.sqrt(diskriminantas))/(2*skA);
			System.out.println("Sprendinys x1:" + x1);
			double x2 = ((-skB)+Math.sqrt(diskriminantas))/(2*skA);
			System.out.println("Sprendinys x2:" + x2);
		}

	}

}
