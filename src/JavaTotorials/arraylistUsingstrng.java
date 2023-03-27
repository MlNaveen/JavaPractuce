package JavaTotorials;

import java.util.ArrayList;

public class arraylistUsingstrng {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();

		marks.add(90);
		marks.add(50);
		marks.add(70);
		marks.add(30);

		// variable size checking
		System.out.println(marks.size());

		// manaki kavalsina variable lo una element ni display chestudhi
		System.out.println(marks.get(2));

		// replacing
		marks.set(3, 20);

		// aftr replacing
		System.out.println(marks.get(3));

	}

}
