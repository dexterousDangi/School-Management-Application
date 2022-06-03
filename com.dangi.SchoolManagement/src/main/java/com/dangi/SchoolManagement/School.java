package com.dangi.SchoolManagement;

import java.util.List;

/**
 * the school have many students and teacher
 * implements teacher and student using an arraylist
 */
public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpend;
	
	/**
	 * new School object is created.
	 * @param teacher list of teacher in the school.
	 * @param student list of the student in the school.
	 */
	public School(List<Teacher> teacher, List<Student> student) {
		this.teachers = teacher;
		this.students = student;
	}

	/** 
	 * @return the teachers list in the school
	 */
	public List<Teacher> getTeacher() {
		return teachers;
	}

	/**
	 * @param teacher the teacher to set
	 */
	public void addTeacher( Teacher  teacher) {
		teachers.add(teacher);
	}

	/**
	 * @return the student gives total no.of students
	 */
	public List<Student> getStudent() {
		return students;
	}

	/**
	 * @param student add new student
	 */
	public void addStudent(  Student  student) {
		students.add(student);
	}

	/** 
	 * @return the totalMoneyEarned by the school
	 */
	public int getTotalMoneyEarned() {
			
		return totalMoneyEarned;
	}

	/**
	 * @param totalMoneyEarned the totalMoneyEarned to set
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	/**
	 * @return the totalMoneySpend
	 */
	public int getTotalMoneySpend() {
		return totalMoneySpend;
	}

	/**
	 * update the money that is spend by the school and which 
	 * is the money given to the teacher
	 * @param totalMoneySpend the totalMoneySpend to set
	 */
	public static void updateTotalMoneySpend(int MoneySpend) {
		totalMoneyEarned -= MoneySpend;
	}

	
	

}
