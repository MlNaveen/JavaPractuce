package SeleniumPractice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the a,b,c values");
		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int h = a + b + c;

		System.out.print("sum of values is >>>" + h);

	}
}