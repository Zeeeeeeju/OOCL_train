package model;

public class Student {
	
	private String idNO;
	private String names;
	private char gender;
	private int age;
	
	public Student() {
	}
	
	public Student(String idNO, String names, char gender, int age) {
		this.idNO = idNO;
		this.names = names;
		this.gender = gender;
		this.age = age;
	}

	public String getIdNO() {
		return idNO;
	}

	public void setIdNO(String idNO) {
		this.idNO = idNO;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [idNO=" + idNO + ", names=" + names + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
