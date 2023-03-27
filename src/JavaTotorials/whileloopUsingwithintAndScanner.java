package JavaTotorials;

import java.util.Scanner;

public class whileloopUsingwithintAndScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter i value");
		int i = sc.nextInt();

		System.out.println("Enter k value");
		int k = sc.nextInt();

		while (i <= k) {
			// i++; ikkada i++ isthey starting number false ayee migatha vatini print
			// chestunhi
			// ex;'i'value 1 anukundham 'k' value 50 anukundham (1<50) condition trueney
			// kani print mathram 2345677...50 varaku isthundhi adhey kindha istey
			// 12345678....49 varaku vasthundhi 50 vastey condition false

			System.out.println(i);

			System.out.println("Hello World");

			i++;
		}

	}

}
