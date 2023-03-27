package JavaTotorials;

public class stringswithifElseUsingEqualIgnoreCase {

	public static void main(String[] args) {

		String expectnm, actualnm;

		expectnm = "GOOGLE";
		actualnm = "google";

		// equalignorecase aneydhi boolean ki link ayintudhi so manaki google,GOOGLE
		// rendu same kabbati 'true'
		// print lo test pass ichamu

		if (expectnm.equalsIgnoreCase(actualnm)) {
			System.out.println("test pass");
		}

		else {
			System.out.println("test fail");

		}
	}

}
