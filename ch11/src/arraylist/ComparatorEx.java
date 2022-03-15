package arraylist;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구별 x
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Desending()); // 역순정렬
		System.out.println("strArr=" + Arrays.toString(strArr));

	}
}

class Desending implements Comparator {
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}
}
