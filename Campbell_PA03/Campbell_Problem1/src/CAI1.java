import java.security.SecureRandom;
import java.util.Scanner;
public class CAI1 {
	public static int ans;
	static SecureRandom randomInt = new SecureRandom();
	public static int randInt1 = randomInt.nextInt(10);
	public static int randInt2 = randomInt.nextInt(10);
	public static int correctAns;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		quiz();
	}
	
	public static void quiz() {
		askQuestion();
		correctAns = randInt1 * randInt2;
		isAnswerCorrect();
	}
	
	public static void askQuestion() {
		System.out.println("How much is " + randInt1 + " times " + randInt2);
		readResponse();
		return;
	}
	
	public static void readResponse() {
		ans = input.nextInt();
		return;
	}
	
	public static void isAnswerCorrect() {
		if(ans == correctAns) {
			displayCorrectResponse();
		}
		else
			displayIncorrectResponse();
			askQuestion();
			isAnswerCorrect();
	}
	
	public static void displayCorrectResponse() {
		System.out.println("Very good!");
		System.exit(0);
	}
	
	public static void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
	}

}
