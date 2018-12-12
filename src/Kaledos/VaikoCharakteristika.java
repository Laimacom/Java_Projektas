package Kaledos;

public class VaikoCharakteristika {

	private String vardas;
	private String pavarde;
	private String charakteris;
	
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
	public String getCharakteris() {
		return charakteris;
	}
	public void setCharakteris(String charakteris) {
		this.charakteris = charakteris;
	}
	
	@Override
	public String toString() {
	return vardas + "  " + pavarde + " " + charakteris;
	}
	
}
