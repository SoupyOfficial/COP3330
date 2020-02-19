public class SavingsAccount {

private static double annualInterestRate;
private double savingsBalance;
	
	public SavingsAccount(double balance) {
		this.setSavingsBalance(balance);
}

	public double calculateMonthlyInterest() {
		double interest = (getSavingsBalance() * annualInterestRate) / 12;
		setSavingsBalance(getSavingsBalance() + (getSavingsBalance() * annualInterestRate) / 12);
		return interest;
	}
	
	public static void modifyInterestRate(double rate) {
		annualInterestRate = rate;
		return;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

}
