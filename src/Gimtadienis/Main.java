package Gimtadienis;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		reada();
	}
	
	private static String read() throws IOException {
		String kelias = "src\\Gimtadienis\\Duom.txt";
		return kelias;
	}
	
	private static /*Person[]*/  void reada() throws IOException {
	File file = new File(read());
	Scanner scanner = new Scanner(file);
		//String name = scanner.next();
		//String surname = scanner.next();
		//int year = scanner.nextInt();
		//int month = scanner.nextInt();
		//int day = scanner.nextInt();
		Person[] persons = new Person[3];

	for (int i = 0; i < 3; i++) {
		Person zmones = new Person();
		zmones.setName(scanner.next());
		zmones.setSurname(scanner.next());
		zmones.setYear(scanner.nextInt());
		zmones.setMonth(scanner.nextInt());
		zmones.setDay(scanner.nextInt());
		persons[i] = zmones;
		System.out.println(zmones);
	}
	scanner.close();
	//return persons;
}

}
