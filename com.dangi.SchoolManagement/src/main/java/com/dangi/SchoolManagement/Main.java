package com.dangi.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Teacher parshant=new Teacher(1, "Parshant", 20000);
		Teacher mohit=new Teacher(2, "Mohit", 25000);
		Teacher aman=new Teacher(3, "Aman", 30000);
		List<Teacher> teacherList= new ArrayList<Teacher>();
		teacherList.add(parshant);
		teacherList.add(mohit);
		teacherList.add(aman);
		
		Student himanshu=new Student(1, "Himanshu", 12);
		Student pardeep=new Student(2, "Pardeep", 12);
		Student vikram =new Student(3, "Vikram", 11);
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(himanshu);
		studentList.add(pardeep);
		studentList.add(vikram);
		
		School vps= new School(teacherList, studentList);
		pardeep.payFees(20000);
		System.out.println("VPS has earned Rs. "+ vps.getTotalMoneyEarned());
		vikram.payFees(20000);
		System.out.println("VPS has earned Rs. "+ vps.getTotalMoneyEarned());
		
		System.out.println("--- Making VPS pay salary---");
		mohit.receiveSalaray(mohit.getSalary());
	
		System.out.println("VPS has earned Rs. "+ vps.getTotalMoneyEarned());
		
		aman.receiveSalaray(aman.getSalary());		
		System.out.println("VPS has earned Rs. "+ vps.getTotalMoneyEarned());
		
		System.out.println(pardeep);
		System.out.println(aman);
	}

}
