package ch10_oop.sec_01.person;

public class Worker extends Person {
	int WorkerId;
	
	void work() {
		System.out.println(name + " 이/가 열심히 일을 합니다");
	}
}
