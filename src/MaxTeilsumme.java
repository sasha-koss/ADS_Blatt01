
public class MaxTeilsumme {
	
	private int maxsumme =	Integer.MIN_VALUE; // kleinste negative Integer - Zahl
	private int von=0;
	private int bis=0;
	private int summe=0;
	private int countadd=0;
	private long calcTime=0;

	public void calcMaxTeilsume(int[] A){
		maxsumme =	Integer.MIN_VALUE; // kleinste negative Integer - Zahl
		von=0;
		bis=0;
		countadd=0;
		long starttime = System.nanoTime();
		int n = A.length;	
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
		calcTime = System.nanoTime()-starttime;
	}
	
	public void printTeilsumme(){
		
		System.out.println("Vergangene Zeit in Nanosekunden:  " + calcTime);
		System.out.println("max . Teilsumme: " +maxsumme);
		System.out.println("erster Index " +von);
		System.out.println("letzter Index " +bis);
		System.out.println("Anzahl Additionen " +countadd);
		
	}
	public int getTeilSumme(){
		return summe;
	}
	
	public int getIndexVon(){
		return von;
	}
	
	public int getIndexBis(){
		return bis;
	}
	
	public int getAnzAdd(){
		return countadd;
	}
	
	public long getCalcTime(){
		return calcTime;
	}
}
