
public class SumTwoNumbers {

	/**
	 * Method that receives two numbers and returns the sum of both
	 *
	 * @param a - Some Integer Number
	 * @param b - Another Integer Number
	 * @return The result of a + b
	 */
	public static Integer sum(Integer a, Integer b) {
		return Math.addExact(a, b);
	}

	public static void main(String[] args) {

		System.out.println(SumTwoNumbers.sum(-1, 3));

	}

}
