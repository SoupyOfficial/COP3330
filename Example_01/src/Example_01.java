import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {
		System.out.println("Hello everyone!");
		
		System.out.println("What class are you in?");
		Scanner in = new Scanner(System.in);
		String name = in.next();
		
		System.out.println("Welcome to " + name  + "!");
		
		
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		System.out.printf("You are %d years old", age);

	}

}
