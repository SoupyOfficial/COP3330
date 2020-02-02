
public class Encrypter {
	
	public static void Encryption(int userValue[]) { 
		int i;
		for(i = 0; i < 4; i++) {
		userValue[i] = (userValue[i] + 7) % 10;		
		}
		int temp13 = userValue[0];
		userValue[0] = userValue[2];
		userValue[2] = temp13;
		
		int temp24 = userValue[1];
		userValue[1] = userValue[3];
		userValue[3] = temp24;
		
		System.out.println("Encrypted Integer:");
		for(i = 0; i < 4; i++) {
			System.out.print(userValue[i]);
		}
	}
}
