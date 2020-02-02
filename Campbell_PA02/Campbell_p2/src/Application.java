import java.util.Scanner;

public class Application {
	public	static	void main(String[]	args) {
		
		int[] userValue = {0, 0, 0, 0};
		int i;
		Scanner myObj = new Scanner(System.in);
		System.out.println("1. Encrypt\n2. Decrypt");
		int menu = myObj.nextInt();
		

		switch(menu) {	
			case 1:
				System.out.println("Please input 4 integers to encrypt:");
				for(i = 0; i < 4; i++) {
					System.out.println("Integer " + (i + 1) + ":");
					userValue[i] = myObj.nextInt();	
				}				
				Encrypter.Encrypt(userValue);
				break;
							
			case 2:
				System.out.println("Please input 4 integers to decrypt:");
				for(i = 0; i < 4; i++) {
					System.out.println("Integer " + (i + 1) + ":");
					userValue[i] = myObj.nextInt();	
				}
				Decrypter.Decrypt(userValue);
				break;
			
		
		}
		myObj.close();
	}
}
