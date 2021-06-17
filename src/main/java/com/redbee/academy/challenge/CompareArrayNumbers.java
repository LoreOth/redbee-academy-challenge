
//import com.sun.tools.javac.util.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CompareArrayNumbers {

	/**
	 * Method that receives two lists and returns another list with de max of each
	 * index
	 *
	 * @param a - Some Integer Number
	 * @param b - Another Integer Number
	 * @return The result of a + b
	 */
	public static List<Integer> max(List<Integer> a, List<Integer> b) {
		List<Integer> maximo;
		maximo = new ArrayList<>();

		Iterator<Integer> ita = a.iterator();
		Iterator<Integer> itb = b.iterator();
		while ((ita.hasNext() && (itb.hasNext()))) {
			maximo.add(Math.max(ita.next(), itb.next()));
		}
		if (ita.hasNext()) {
			while (ita.hasNext()) {
				maximo.add(ita.next());
			}
		} else {
			while (itb.hasNext()) {
				maximo.add(itb.next());
			}

		}
		return maximo;

	}

	public static void main(String[] args) {
		// CompareArrayNumbers c= new CompareArrayNumbers();
		List<Integer> a;
		a = new ArrayList<>();
		List<Integer> b;
		b = new ArrayList<>();
		a.add(50);
		a.add(100);
		a.add(10);
		b.add(30);
		a.add(180);
		a.add(80);
		System.out.println(CompareArrayNumbers.max(a, b));

	}
}
