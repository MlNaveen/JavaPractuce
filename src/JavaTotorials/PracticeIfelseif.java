package JavaTotorials;

import java.util.Scanner;

public class PracticeIfelseif {

	public static void main(String[] args) {

		System.out.println("Enter names");
		Scanner sc = new Scanner(System.in);
		String i = "n";

		if (i.equalsIgnoreCase("n"))

		{
			System.out.println("test pass");

		} else if (i.equalsIgnoreCase("m")) {
			System.out.println("test fail");
		} else {
			System.out.println("test fail");
		}

	}

}