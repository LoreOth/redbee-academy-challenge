import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumArrayNumbers {

	/**
	 * Method that receives an array of numbers and returns the sum of each number
	 *
	 * @param array - Some integer list. ([1,2,3])
	 * @return The result of 1 + 2 + 3
	 */
	public static Integer sum(List<Integer> array) {
		Integer total = 0;
		Iterator<Integer> it = array.iterator();
		while (it.hasNext()) {
			total = total + it.next();
		}

		return total;
	}

	public static void main(String[] args) {
		// CompareArrayNumbers c= new CompareArrayNumbers();
		List<Integer> a;
		a = new ArrayList<>();

		a.add(2);
		a.add(4);
		a.add(-1);
		a.add(8);

		System.out.println(SumArrayNumbers.sum(a));

	}
}
