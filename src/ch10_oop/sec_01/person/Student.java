package ch10_oop.sec_01.person;

public class Student extends Person {
	int studentId; 
	
	 void study() {
		System.out.println(name + " 이/가 공부를 합니다.");
	}
}
