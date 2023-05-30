package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("16.5 inch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop details = new Desktop();
		details.computerModel(); // Parent class - Computer
		details.desktopSize(); // Child class - Desktop

	}

}
