package week4.day2;

public class MethodOverloading {

	public void getStudentDetails(int ID) {
		System.out.println("ID : " + ID);
	}

	public void getStudentDetails(String name) {
		System.out.println("Name : " + name);
	}

	public void getStudentDetails(boolean backLogs) {
		System.out.println("Backlogs : " + backLogs);
	}

	public void getStudentDetails(String email, String linkedinID) {
		System.out.println("E-mail id : " + email);
		System.out.println("LinkedIn id: " + linkedinID);
	}

	public void getStudentDetails(int countryCode, long mobileNo) {
		System.out.println("Mobile number : +" + countryCode + mobileNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading details = new MethodOverloading();
		details.getStudentDetails("Karun");
		details.getStudentDetails(420);
		details.getStudentDetails(91, 6800123194l);
		details.getStudentDetails("zyx@hotmail.com", "karunvaishnav");
		details.getStudentDetails(true);

	}

}
