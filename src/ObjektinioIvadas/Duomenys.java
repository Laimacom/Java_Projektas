package ObjektinioIvadas;


public class Duomenys {

	public static void main(String[] args) {
		double [] newPazymiai1 = {8, 9, 10, 10, 7};
		int [] newLankomumas1 = {1, 0, 1, 1, 1};
		
		Student studentas1 = new Student("Jonas", "Jonaitis", "5A", newPazymiai1, newLankomumas1);
		StudentMetodai.printVardasPavardeKlase(studentas1);
		StudentMetodai.printVidurkis(studentas1);
		StudentMetodai.printPraleista(studentas1);
		
		double [] newPazymiai2 = {5, 6, 7, 8, 5};
		int [] newLankomumas2 = {0, 0, 1, 0, 1};
		
		Student studentas2 = new Student("Petras", "Petraitis", "5B", newPazymiai2, newLankomumas2);
		StudentMetodai.printVardasPavardeKlase(studentas2);
		StudentMetodai.printVidurkis(studentas2);
		StudentMetodai.printPraleista(studentas2);
	}

}
