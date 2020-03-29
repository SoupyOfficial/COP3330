import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateRemover {
	
	String[] uniqueWords;
	String dataFile;
	String fileString;
	String[] words;
	
	public DuplicateRemover() {
		int i = 0;
		File dataFile = new File("problem1.txt");
		Scanner in = null;
		try {
			in = new Scanner(dataFile);
		} 
		catch (FileNotFoundException e) {
			
			System.out.println("File not scanned");
		}
		
		
		fileString = in.next();
		fileString += " ";
		while(in.hasNextLine()) {
			fileString += in.next();
			fileString += " ";
			//System.out.print(words);
			i++;
		}
		words = fileString.split(" ");
		
		for(i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
		}
		
		in.close();
	}

	

	String[] remove() {
		//uses a Set of Strings to eliminate duplicate words from the file referenced by dataFile
				
		uniqueWords = Arrays.stream(words).distinct().toArray(String[]::new);
			
	
		return uniqueWords;
	}
	
	
	void write(String[] uniqueWords) {
		try {
			FileWriter ouputFile = new FileWriter("unique_words.txt");
			for (int i = 0; i < uniqueWords.length; i++) {
				ouputFile.write(uniqueWords[i] + "\n");
			}
			ouputFile.close();
		} 
		catch (IOException e) {
			System.out.println("Output not written to file");
		}
		
	}
}
