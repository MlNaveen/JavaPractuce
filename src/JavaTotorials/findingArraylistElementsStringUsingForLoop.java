package JavaTotorials;

import java.util.ArrayList;

public class findingArraylistElementsStringUsingForLoop {

	public static void main(String[] args) {

		ArrayList<String> bus = new ArrayList<>();

		bus.add("naveen");
		bus.add("delux");
		bus.add("indhra");
		bus.add("ola");

		for (int i = 0; i < bus.size(); i++) {

			System.out.println(bus.get(i));
		}

	}

}
