package com.dangi.SchoolManagement;


/**
 * this class is responsible for keeping the track
 * of the teacher's name, id, salary
 * 
 */
public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * create a new teacher object
	 * @param id id for the teacher.
	 * @param name name of the teacher.
	 * @param salary salary of the teacher.
	 */
	public Teacher(int id, String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
	}
	
	/**
	 * @return id of the teacher
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * @return the name of the teacher
	 */
	public String getName() {
		return this.name;
	}
	 
	/**
	 * @return the salary of the teacher
	 */
	public int getSalary() {
		return this.salary;
	}
	
	/**
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	/**
	 * 
	 * @param salary
	 */
	public void receiveSalaray(int salary) {
		salaryEarned+=salary;
		School.updateTotalMoneySpend(salary);
	}
	
	@Override
	public String toString() {
		return "Teacher Name: "+name+"\nTeacher Id: "+id+"\nSalary Earned: "+salaryEarned;
	}
}








