
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {4, -2, -2, -3, 1, 5, -2, 0, 1}; //A sei die zu betrachtende Folge
		long starttime = System.nanoTime();
		int n = A.length;
		int maxsumme =	Integer.MIN_VALUE; // kleinste negative Integer - Zahl
		int von=0;
		int bis=0;
		int summe=0;
		int countadd=0;
		for(int i = 0; i < n ;i++){
			summe=0;
			for(int ii=i; ii<n;ii++ ){
				summe = summe+ A[ii];
				countadd++;
				if(summe>maxsumme) {
					maxsumme=summe;
					von=i;
					bis=ii;
					}
			}
		}
		
		System.out.println("Vergangene Zeit in Nanosekunden:  " + (System.nanoTime() - starttime));
		System.out.println("max . Teilsumme: " +maxsumme);
		System.out.println("erster Index " +von);
		System.out.println("letzter Index " +bis);
		System.out.println("Anzahl Additionen " +countadd);
		
	}

}
