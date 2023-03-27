package JavaTotorials;

import java.util.ArrayList;

public class arraylistUsingWithString {

	public static void main(String[] args) {

		ArrayList<String> apdist = new ArrayList<>();

		apdist.add("kurnool");

		apdist.add("nellore");

		apdist.add("kadapa");

		apdist.add("chitoor");

		System.out.println(apdist.size());

		System.out.println(apdist.get(0));
		System.out.println(apdist.get(1));
		System.out.println(apdist.get(2));
		System.out.println(apdist.get(3));

		apdist.set(3, "anathpuram");
		System.out.println(apdist.get(3));

	}

}
