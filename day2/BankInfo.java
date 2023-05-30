package week4.day2;

public class BankInfo {

	public void savingAccount() {
		System.out.println("You have Rs. 0.50 in savings account");
	}

	public void fixedDeposit() {
		System.out.println("You have Rs. 1000.00 in fixed deposit account");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankInfo info = new BankInfo();
		info.fixedDeposit(); // before method over-riding
	}

}
