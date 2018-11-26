package ObjektinioIvadas;

public class StudentMetodai {
	
	public static void printVardasPavardeKlase(Student student) {
		System.out.println(student.getVardas() + " " + student.getPavarde() + " " + student.getKlase());		
}
	
	public static void printVidurkis(Student student) {
		System.out.println("Studento pazymiu vidurkis: ");
		System.out.println(String.valueOf(student.vidurkis()));		
	}
	
	public static void printPraleista(Student student) {
		System.out.println("Praleista pamoku: ");
		System.out.println(String.valueOf(student.praleista()));		
	}
}
