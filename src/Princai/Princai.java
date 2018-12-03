package Princai;

public class Princai {
	private String vardas = " ";
	private String pavarde = " ";
	private int pedos = 0;
	private int coliai = 0;
	private int kiekis = 0;
	

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String indeksas) {
		this.vardas = indeksas;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}

	public int getPedos() {
		return pedos;
	}

	public void setPedos(int pedos) {
		this.pedos = pedos;
	}

	public int getColiai() {
		return coliai;
	}

	public void setColiai(int coliai) {
		this.coliai = coliai;
	}

	public int getKiekis() {
		return kiekis;
	}

	public void setKiekis(int kiekis) {
		this.kiekis = kiekis;
	}
	@Override
	public String toString() {
	return vardas + " " + pavarde + " " + pedos + " " + coliai;
	}
	
}
