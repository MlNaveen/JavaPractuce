package JavaTotorials;

public class charWithifElseIf {

	public static void main(String[] args) {

		char course = 's';

		// "||" meaning (and)

		if (course == 's' || course == 'S') {
			System.out.println("Selenium");
		} else if (course == 'j' || course == 'J') {
			System.out.println("java");
		}

		else if (course == 'p' || course == 'S') {
			System.out.println("python");
		} else {
			System.out.println("invalid");
		}

	}

}
