package ObjektinioIvadas;

public class Student {
	private String vardas = " ";
	private String pavarde = " ";
	private String klase = " ";
	private double pazymiai[] = null;
	private int lankomumas[] = null;

	public Student(){
		vardas = "Nera vardo";
		pavarde = "Nera pavardes";
		klase = "Nera klases";
		pazymiai = new double[0];
		lankomumas = new int[0];
	}
	public Student(String vardas, String pavarde, String klase, double[] pazymiai, int[] lankomumas){
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.klase = klase;
		this.pazymiai = pazymiai;
		this.lankomumas = lankomumas;
	}
	
	public String getVardas() {
		return vardas;
	}
	public String getPavarde() {
		return pavarde;
	}
	public String getKlase() {
		return klase;
	}
	public double[] getPazymiai() {
		return pazymiai;
	}
	public int[] getLankomumas() {
		return lankomumas;
	}
	public double vidurkis() {
		int suma = 0;		
		for (int i =0; i<this.pazymiai.length; i++) {
			suma += pazymiai[i];			
		}
		
		double vidurkis = suma/pazymiai.length;
		return vidurkis;
	}
	
	public int praleista() {
		int kiekis = 0;		
		for (int i =0; i<this.lankomumas.length; i++) {
			if(lankomumas[i] == 0) {
				kiekis++;
			}		
		}
		return kiekis;
	}
	
}
