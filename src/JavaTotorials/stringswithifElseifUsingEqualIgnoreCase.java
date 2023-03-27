package JavaTotorials;

import java.util.Scanner;

public class stringswithifElseifUsingEqualIgnoreCase {

	public static void main(String[] args) {
		System.out.println("Enter leater");
		Scanner sc = new Scanner(System.in);

		String subjectnm = "Z";
		subjectnm = sc.nextLine();

		if (subjectnm.equalsIgnoreCase("Z")) {
			System.out.println("Zoology");
		}

		else if (subjectnm.equalsIgnoreCase("B")) {
			System.out.println("Botony");
		}

		else if (subjectnm.equalsIgnoreCase("C")) {
			System.out.println("Chemistry");
		} else {
			System.out.println("invalid");
		}

	}

}
