package Kaledos;

public class VaikoCharakteristika {

	private String vardas;
	private String pavarde;
	private String charakteristika;
	
	public String getVardas() {
		return vardas;
	}
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	public String getPavarde() {
		return pavarde;
	}
	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	public String getCharakteristika() {
		return charakteristika;
	}
	public void setCharakteristika(String charakteristika) {
		this.charakteristika = charakteristika;
	}
	
	@Override
	public String toString() {
	return vardas + "  " + pavarde + " " + charakteristika;
	}
	
}
