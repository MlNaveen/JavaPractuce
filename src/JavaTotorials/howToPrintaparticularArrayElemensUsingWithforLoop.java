package JavaTotorials;

import java.util.ArrayList;

public class howToPrintaparticularArrayElemensUsingWithforLoop {

	public static void main(String[] args) {

		String[] friends = { "savithri", "ravi", "sesu", "devid", "guva" };

		// ikkada 3 ani ichanu antey first 3 kakunda migatha elements print cheyamani
		// condion ichanu
		// for(int i = 3;i<friends.length;i++)

		// ikkada -3 ani ichanu atey last 3 print cheyamani condtion ichanu
		for (int i = friends.length - 3; i < friends.length; i++) {

			// System.out.println(i);
			System.out.println(friends[i]);

			// System.out.println(i);
		}

	}

}
