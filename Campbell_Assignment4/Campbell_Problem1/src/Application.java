
public class Application {

	public static void main(String[] args) {
		
		String[] uniqueWords = null;

		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
		uniqueWords = duplicateRemover.remove();
		
		duplicateRemover.write(uniqueWords);
		
	}

}
