package main;

import model.Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("123","lzj",'男',22);
		
		System.out.println(student.toString());
	}
}
