import java.util.Map;

public class Application {
	
	public static void main(String[] args) {
			
			Map<String, Integer> wordCount;
	
			DuplicateCounter duplicateCounter = new DuplicateCounter();
			
			wordCount = duplicateCounter.count();
			
			duplicateCounter.write(wordCount);
			
		}

}
