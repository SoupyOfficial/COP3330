
public class Decrypter {
	
	public static void Decrypt(int userValue[]) { 
		int i;
		for(i = 0; i < 4; i++) {
			if(userValue[i] == 7 || userValue[i] == 8 || userValue[i] == 9) {
				userValue[i] -= 7;
			}
			else if(userValue[i] < 7) {
				userValue[i] += 3;
			}
		}
		int temp13 = userValue[0];
		userValue[0] = userValue[2];
		userValue[2] = temp13;
		
		int temp24 = userValue[1];
		userValue[1] = userValue[3];
		userValue[3] = temp24;
		
		System.out.println("Deccrypted Integer:");
		for(i = 0; i < 4; i++) {
			System.out.print(userValue[i]);
		}
	}
}