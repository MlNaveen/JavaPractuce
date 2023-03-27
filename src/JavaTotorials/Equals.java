package JavaTotorials;
public class Equals {

	public static void main(String[] args) {

		String x = "Google";

		String y = "google";

		System.out.println(x.equals(y));

		System.out.println(x.equalsIgnoreCase(y));

		// equal; antey okey word same ga undha ledha ani check chethundhi
		// ex; 'Google''google' iee rendu words meaning okatey kaani same kadhu because
		// first word lo 'G' capitol lo undhi second word 'g' smaller lo undhi
		// so condition false

		// equalIgnoreCase; antey okey word same ga undha ledha ani check chethundhi
		// ex; 'Google''google' iee rendu words meaning okatey
		// word capitol lo smaller lo unna meaning same
		// so condition true

	}

}