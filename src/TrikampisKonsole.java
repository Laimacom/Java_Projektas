
import java.util.Scanner;

public class TrikampisKonsole {
	
	public static void main(String[] args) {
		System.out.println("Iveskite pirmos krastines ilgi: ");
		System.out.println("Iveskite antros krastines ilgi: ");		
		Scanner reader= new Scanner(System.in);		
		String krastine1 = reader.nextLine();
		String krastine2 = reader.nextLine();

		System.out.println("Krastine" + krastine1 + krastine2);
		reader.close();
	}

}
