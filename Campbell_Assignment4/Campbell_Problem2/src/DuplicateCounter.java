import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCounter {	

	String dataFile;
	String fileString;
	String[] words;
	
	public DuplicateCounter() {
		int i = 0;
		
		File dataFile = new File("problem2.txt");
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
			i++;
		}
		words = fileString.split(" ");
		
		for(i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
		}
		
		in.close();
	}

	

	 Map<String, Integer> count() {
		Map<String, Integer> wordCounter = new HashMap<>();
				
		
		for(int i = 0; i < words.length; i++) {
			Integer c = 1;
			for(int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j]) && !wordCounter.containsKey(words[i])) {
					c++;
				}			
			}
			
				if (c > 1) {
					wordCounter.put(words[i], c);
					}
				
			
		}
		
		return wordCounter;
	}
		
	
	void write(Map<String, Integer> wordCount) {
		Iterator<Entry<String, Integer>> it = wordCount.entrySet().iterator();
		try {
			FileWriter ouputFile = new FileWriter("unique_word_counts.txt");
			
			
			for (int i = 0; i < wordCount.size(); i++) {
				ouputFile.write(it.next() + "\n");
			}
			ouputFile.close();
		} 
		catch (IOException e) {
			System.out.println("Output not written to file");
		}
		
	}
}
