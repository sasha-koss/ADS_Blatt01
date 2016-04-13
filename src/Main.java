import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ReadFile x = new ReadFile();
		MaxTeilsumme mT = new MaxTeilsumme();
		try {
			
			System.out.println("30 Integer");
			mT.calcMaxTeilsume(x.readFile("30.txt",30));
			mT.printTeilsumme();
			System.out.println(" ");
			System.out.println("300 Integer");
			mT.calcMaxTeilsume(x.readFile("300.txt",300));
			mT.printTeilsumme();
			System.out.println(" ");
			System.out.println("3000 Integer");
			mT.calcMaxTeilsume(x.readFile("3000.txt",3000));
			mT.printTeilsumme();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
