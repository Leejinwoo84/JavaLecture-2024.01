package ch10_oop.sec05_equals;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c1 = new Customer(1001, "제임스", 27, true);
		Customer c2 = new Customer(1001, "제임스 브라운", 27, true);
		Customer c3 = new Customer(1001, "마리아", 27, true);

		if (c1.equals(c2))
			System.out.println(c1 + "과 " + c2 + "는 같습니다.");
		else
			System.out.println("다릅니다.");
		
		System.out.println("c1 hachCode: " +c1.hashCode());
		System.out.println("c1 hachCode: " +c2.hashCode());
		System.out.println("c1 hachCode: " +c3.hashCode());
	}

}
