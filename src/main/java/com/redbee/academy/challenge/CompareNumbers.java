
public class CompareNumbers {

	/**
	 * Method that receives two numbers and returns the max of both
	 *
	 * @param a - Some Integer Number
	 * @param b - Another Integer Number
	 * @param c - Another Integer Number
	 * @return The max of a, b and c
	 */
	public static Integer max(Integer a, Integer b, Integer c) {

		if (a > b) {
			if (a > c) {
				return a;
			} else
				return c;
		}
		if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {

		System.out.println(CompareNumbers.max(59, 59, 5));

	}

}
