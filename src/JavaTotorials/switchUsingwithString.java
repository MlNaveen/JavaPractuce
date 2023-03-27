package JavaTotorials;

import java.util.Scanner;

public class switchUsingwithString {

	public static void main(String[] args) {
		System.out.println("Enter leater");

		Scanner tata = new Scanner(System.in);

		// >>> string variable vachesi 'mybro'
		String mybro = tata.nextLine();

		switch (mybro.toLowerCase())

		{
		case "s":

			System.out.println("Sekhar");

			break;

		case "r":

			System.out.println("Ravindra");

			break;

		// default:
		// System.out.println("invalid");

		}

		switch (mybro.toUpperCase()) {
		case "M":

			System.out.println("Manohar");

			break;

		case "V":

			System.out.println("Vishnu");

			break;

		}

	}

}
