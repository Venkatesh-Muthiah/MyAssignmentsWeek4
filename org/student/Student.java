package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Richard");
	}

	public void studentDept() {
		System.out.println("CSE");
	}

	public void studentID() {
		System.out.println("108551");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student detail3 = new Student();

		// Grandparent
		detail3.collegeName();
		detail3.collegeCode();
		detail3.collegeRank();
		System.out.println();

		// Parent
		detail3.deptName();
		System.out.println();

		// Child
		detail3.studentName();
		detail3.studentID();
		detail3.studentDept();
	}

}
