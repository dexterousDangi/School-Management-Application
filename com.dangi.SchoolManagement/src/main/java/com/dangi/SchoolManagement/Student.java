package com.dangi.SchoolManagement;

/**
 * This class is responsible for keeping the track of fees, name, grade and fees
 * paid.
 *
 */
public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	/**
	 * to create a new Student by Intialising Fees for every student is Rs. 20000
	 * Fees paid initially is 0.
	 * 
	 * @param id    for the student : uniquel
	 * @param name  name of the student
	 * @param grade grade of the student
	 */
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 20000;
	}

	/**
	 * To update the grade of the student
	 * 
	 * @param grade new grade of the student.
	 */

	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the id of the student
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name of the student
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the grade of the student
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @return the feesPaid of the student
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	/**
	 * @return the feesTotal  of the student
	 */
	public int getFeesTotal() {
		return feesTotal;
	}

	/**
	 * Keep adding the fees to feesPaid field.
	 *  Add the fees to the fess paid. the
	 * school is going to receive the funds .
	 * 
	 * @param fees
	 */
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(fees);

	}
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student Name: "+name+"\nStudent Id: "+id+"\n"+"fees Paid: "+ feesPaid+"\nRemain fees: "+getRemainingFees();
	}
}












