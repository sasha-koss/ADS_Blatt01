import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	public int[] readFile(String fileName, int fileRows) throws FileNotFoundException, IOException {
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			int[] line = new int[fileRows];
			int i=0;
			while (br.readLine()!= null){
				line[i] = Integer.valueOf(br.readLine());
				i++;
			}	    
	    	return line;
		}
	}
}
