package Kaledos;

public class VaikuNorai {
	
	private String vardas;
	private String pavarde;
	private int amzius;
	private String adresas;
	private String noras;
	
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
	public int getAmzius() {
		return amzius;
	}
	public void setAmzius(int amzius) {
		this.amzius = amzius;
	}
	public String getAdresas() {
		return adresas;
	}
	public void setAdresas(String adresas) {
		this.adresas = adresas;
	}
	public String getNoras() {
		return noras;
	}
	public void setNoras(String noras) {
		this.noras = noras;
	}
	@Override
	public String toString() {
	return vardas + "  " + pavarde + " " + amzius + " " + adresas + " " + noras;
	}
	
}
