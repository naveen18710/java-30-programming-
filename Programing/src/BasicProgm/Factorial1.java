package BasicProgm;

public class Factorial1 {

	public static void main(String[] args) {
		int no = 7;
		int fact = 1;
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
