package bankapplication;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	private static int index = 0;
	
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				createAccount(); break;
			case 2:
				accountList(); break;
			case 3:
				deposit(); break;
			case 4:
				withdraw(); break;
			case 5:
				run =false;  break;
			default:
				System.out.println("warning: 1 ~ 5 사이의 숫자만 입력하세요");
			}
			
			
		}
	System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌 생성");
		System.out.println("----------");
		
		String ano = "" + (1000 + index);		// index : 현재 빈 곳을 가리킴
		System.out.println("계좌주 이름> ");
		String owner = scan.nextLine();
		System.out.println("최초 입금액");
		int balance = Integer.parseInt(scan.nextLine());
		Account account = new Account(ano, owner, balance);
		
		accountArray[index++] = account;
		
		System.out.println("계좌가 생성되었습니다.");
	}
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌 목록");
		System.out.println("----------");
		
		for (int i = 0; i < index; i++) {
			Account acc = accountArray[i];
			System.out.printf("%s %6s %,10d%n", acc.getAno(), acc.getOwner(), acc.getBalance());
		}
		
	}
	private static void deposit() {
		
		
	}
	private static void withdraw() {
		
		
	}
	
	private static Account findAccount(String ano) {
		return null;
	}
}
