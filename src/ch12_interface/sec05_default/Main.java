package ch12_interface.sec05_default;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		A a = new B();
		a.abc();
		a.def();
		
		a = new C();
		a.abc();
		a.def();
		
		A.ghi();
		
		System.out.println("==========================");
		System.out.println("1. 생성 2. 목록 3. 종료");
		System.out.println("==========================");
		Scanner sc = new Scanner(System.in);
		
		int check = sc.nextInt();
		if(check ==1) {
			
		}
		else if(check ==2) {
			
		}
	}

}
