package lt.bt.Testas;

public class Uzduotis4 {

	public static void main(String[] args) {
		int[] masyvas = {3,5,7,34,1,3,6,8,8,5};
		
		 for(int i = 0; i < masyvas.length; i++){
			 int kiekis = 0;
			 for(int j = 0; j < masyvas.length; j++){
			 if(masyvas[i] == masyvas[j]){
	                kiekis++;
			 		}
	            }
			 System.out.println(masyvas[i] + " - " + kiekis);
		 }
	}
}

