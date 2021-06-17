
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
