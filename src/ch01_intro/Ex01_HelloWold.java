package ch01_intro;
			// class 이름은 대문자로 시작
public class Ex01_HelloWold {
/**
 * 도큐먼트 주석 - API document 만들ㄸ 사용
 * @param args
 */
	// method 이름 main은 소문자로 시작
	public static void main(String[] args) {					//void  리턴 하지 않겠따.
		// sysout, syso 를 타이핑 후 Ctrl + Space 치면 System.out.println() 이 생김.
		System.out.println("Hello Wold!!!");			//문장끝에 반드시 ;을 붙여야한다
		System.out.println("안녕하세요? " + "여러분!!!");
		System.out.println("안녕하세요? 여러분!!!" ); 		// 하나의문자열만 올수 있음
		
		/*
		 * 여러줄의 주석
		 */
		System.out.println();  	// Ctrl + / : 문장을 커멘트 처리(토글) 
		
		 
		 
	}

}
