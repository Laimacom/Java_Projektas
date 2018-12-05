package PadangosbeWrap;

public class Padangos {

		private int aukstis = 0;
		private int plotis = 0;
		private String indeksas = " ";
		private double kaina = 0;
		private int kiekis = 0;
	
		public String getIndeksas() {
		return indeksas;
		}
		public int getAukstis() {
			return aukstis;
		}
		public int getPlotis() {
			return plotis;
		}
		public int getKiekis() {
			return kiekis;
		}
		public double getKaina() {
			return kaina;
		}
		
		public void setIndeksas(String indeksas) {
			this.indeksas = indeksas;
		}
		public void setAukstis(int aukstis) {
			this.aukstis = aukstis;
		}
		public void setPlotis(int plotis) {
			this.plotis = plotis;
		}
		public void setKiekis(int kiekis) {
			this.kiekis = kiekis;
		}
		public void setKaina(double kaina) {
			this.kaina = kaina;
		}
		
		@Override
		public String toString() {
		return plotis + " " + aukstis + " " + indeksas + " " + kaina;
		}
		
}


