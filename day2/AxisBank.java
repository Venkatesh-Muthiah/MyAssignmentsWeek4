package week4.day2;

public class AxisBank extends BankInfo {

	public void fixedDeposit() {
		System.out.println("You have Rs. 1200.00 in fixed deposit account");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank info = new AxisBank();
		info.fixedDeposit(); // after method over-riding
	}

}
