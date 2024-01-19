package ch06_class.melcha;

public class MalchaMain {

	public static void main(String[] args) {
		
		Melcha[] mell = new Melcha[5];
		mell[0] = new Melcha(1, " 비의랩소디", " 임재현", " 비의랩소디", 33229);
		mell[1] = new Melcha(2, " To. X", " 태연", " The 5th Mini", 82843);
		mell[2] = new Melcha(3, " Perfect Night", " 르세라핌", " perfect Night", 95001);
		mell[3] = new Melcha(4, " Drama", " aespa", " The 4th Mini", 68543);
		mell[4] = new Melcha(5, " 에피소드", " 이무진", " 에피소드", 33266);
		
		for (int i = 0; i < mell.length; i++)
			System.out.println(mell[i]);
		
	}

}
