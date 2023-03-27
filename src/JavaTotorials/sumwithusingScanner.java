package JavaTotorials;

import java.util.Scanner;

public class sumwithusingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter x value");

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		System.out.println("enter y value");

		int y = sc.nextInt();

		System.out.println("the sum of");
		System.out.println(x + y);

	}

}
