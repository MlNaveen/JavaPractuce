package JavaTotorials;

import java.util.Scanner;

public class practiceScanerArrayString {

	public static void main(String[] args) {
		System.out.println("Enter number");

		{
			Scanner sc = new Scanner(System.in);
			String[] fruit = { "banana", "apple", "mango", "grapes" };

			for (int i = 0; i < fruit.length; i++) {
				// i = sc. nextInt();
				// System.out.println(sc);

				System.out.println(i);
				System.out.println(fruit[i]);

			}

		}

	}

}
