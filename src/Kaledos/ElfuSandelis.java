package Kaledos;

public class ElfuSandelis {
	
	private String zaislas;
	private int kiekis;
	
	public String getZaislas() {
		return zaislas;
	}
	public String setZaislas(String zaislas) {
		return this.zaislas = zaislas;
	}
	public int getKiekis() {
		return kiekis;
	}
	public void setKiekis(int kiekis) {
		this.kiekis = kiekis;
	}
	@Override
	public String toString() {
	return zaislas + "  " + kiekis;
	}
}

