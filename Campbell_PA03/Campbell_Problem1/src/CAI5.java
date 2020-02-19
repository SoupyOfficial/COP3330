import java.security.SecureRandom;
import java.util.Scanner;
public class CAI5 {
	public static int ans;
	static SecureRandom randomInt = new SecureRandom();
	public static int randInt1;
	public static int randInt2;
	public static int correctAns;
	public static float numCorrectAns;
	public static int retry = 1;
	public static int i = 0;
	public static int difficulty;
	public static int problemType;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(retry == 1) {
		i = 0;
		numCorrectAns = 0;
		readDifficulty();
		readProblemType();
		quiz();
		displayCompletionMessage();
		}
	}
	
	public static void quiz() {
		while(i != 10) {
			generateQuestionArgument();
			askQuestion();
			i++;
			isAnswerCorrect();
			return;
		}		
	}
	
	public static void readProblemType() {
		System.out.println("Please select problem type 1-5:");
		problemType = input.nextInt();
	}
	
	public static void readDifficulty() {
		System.out.println("Please select difficulty 1-4:");
		difficulty = input.nextInt();
		
	}
	
	public static void generateQuestionArgument() {
		switch(difficulty) {
		case 1:
			randInt1 = randomInt.nextInt(10);
			randInt2 = randomInt.nextInt(10);
			break;
		
		case 2:
			randInt1 = randomInt.nextInt(100);
			randInt2 = randomInt.nextInt(100);
			break;
			
		case 3:
			randInt1 = randomInt.nextInt(1000);
			randInt2 = randomInt.nextInt(1000);
			break;
			
		case 4:
			randInt1 = randomInt.nextInt(10000);
			randInt2 = randomInt.nextInt(10000);
			break;
		}
	}
	
	public static void askQuestion() {
		switch(problemType) {
		
		case 1:
			System.out.println("How much is " + randInt1 + " plus " + randInt2);
			correctAns = randInt1 + randInt2;
			readResponse();
			break;
		
		case 2:
			System.out.println("How much is " + randInt1 + " times " + randInt2);
			correctAns = randInt1 * randInt2;
			readResponse();
			break;
			
		case 3:
			System.out.println("How much is " + randInt1 + " minus " + randInt2);
			correctAns = randInt1 - randInt2;
			readResponse();
			break;
		
		case 4:
			System.out.println("How much is " + randInt1 + " divided by " + randInt2);
			correctAns = randInt1 / randInt2;
			readResponse();
			break;
			
		case 5:
			problemType = randomInt.nextInt(3) + 1;
			askQuestion();
			readResponse();
			break;
			
		}
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
			
	}
	
	public static void displayCorrectResponse() {
		int response = randomInt.nextInt(4);
		numCorrectAns++;
		switch(response) {
			case 0:
				System.out.println("Very good!");
				break;
				
			case 1:
				System.out.println("Excellent!");
				break;
			
			case 2:
				System.out.println("Nice Work!");
				break;	
				
			case 3:
				System.out.println("Keep up the good work!");
				break;	
		}
		quiz();
	}
	
	public static void displayIncorrectResponse() {
		int response = randomInt.nextInt(4);
		switch(response) {
		case 0:
			System.out.println("No. Please try again.");
			break;
			
		case 1:
			System.out.println("Wrong. Try once more.");
			break;
		
		case 2:
			System.out.println("Don't give up!");
			break;	
			
		case 3:
			System.out.println("No. Keep trying.");
			break;	
		}
		quiz();
	}
	
	public static void displayCompletionMessage() {
		float grade = (numCorrectAns / 10) * 100;
		System.out.print((int) grade + "%\n");
		if(((numCorrectAns / 10) * 100) < 75) {
			System.out.println("Please ask your teacher for extra help.");
			System.out.println("Would you like to try a new set?\n1: Yes\n2: No");
			int retry = input.nextInt();
			if(retry == 1)
				return;
			else
				System.exit(0);
		}
		else
			System.out.println("Congratulations, you are ready to go to the next level!");
			System.out.println("Would you like to try a new set?\n1: Yes\n2: No");
			int retry = input.nextInt();
			if(retry == 1)
				return;
			else
				System.exit(0);
		
	}
}
