package SeleniumPractice;

import java.util.Scanner;

public class TablesPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ");

		int t = 10;
		int k = 1;
		int g = sc.nextInt();
		while (k <= t) {
			System.out.println(g + "*" + k + "=" + g * k);
			k++;

		}

	}

}
