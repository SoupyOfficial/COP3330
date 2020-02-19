import java.util.Scanner;

public class SavingsAccountTest {

static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		double rate = .04;
		SavingsAccount.modifyInterestRate(rate);
		System.out.println("Saver 1:");
		for(int i = 1; i <= 12; i++) {
		System.out.println("Month: " + i);
		System.out.println("Interest: " + saver1.calculateMonthlyInterest() + "\tBalance: " + saver1.getSavingsBalance());
		}
		System.out.println("Saver 2:");
		for(int i = 1; i <= 12; i++) {
		System.out.println("Month: " + i);
		System.out.println("Interest: " + saver2.calculateMonthlyInterest() + "\tBalance: " + saver2.getSavingsBalance());
		}
		rate = .05;
		SavingsAccount.modifyInterestRate(rate);
		System.out.println("Saver 1:");
		for(int i = 1; i <= 12; i++) {
		System.out.println("Month: " + i);
		System.out.println("Interest: " + saver1.calculateMonthlyInterest() + "\tBalance: " + saver1.getSavingsBalance());
		}
		System.out.println("Saver 2:");
		for(int i = 1; i <= 12; i++) {
		System.out.println("Month: " + i);
		System.out.println("Interest: " + saver2.calculateMonthlyInterest() + "\tBalance: " + saver2.getSavingsBalance());
		}
	}

}
