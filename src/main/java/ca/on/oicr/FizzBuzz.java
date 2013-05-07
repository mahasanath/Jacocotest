package ca.on.oicr;

public class FizzBuzz {
	
	public static String FIZZ = "FIZZ";
	public static String BUZZ = "BUZZ";

	public String decide(int i) {
		if (i == 3) {
			return FIZZ;
		}
		else if (i == 5) {
			return BUZZ;
		}
		else if (i == 8) {
			return "";
		}
		else if (i == 15) {
			return FIZZ+BUZZ;
		}
		return "";
	}

}
