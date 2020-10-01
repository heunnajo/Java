import java.util.*;

public class ComparatorComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"cat","Dog","lion", "tiger"};
		
		//default sorting which is "Comparable"
		Arrays.sort(strArr);
		System.out.println("strArr=" + Arrays.deepToString(strArr));
		
		//does not identify Upper case Lower case
		System.out.println("대소문자 구분없이 사전순 ");
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr="+Arrays.toString(strArr));
		
		System.out.println("역순으로 Comparator 인터페이스를 implement함! ");
		Arrays.sort(strArr,new Descending());
		System.out.println("strArr="+Arrays.toString(strArr));
		
	}

}
class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)02;
			//or simply change to c2.compareTo(c1)
			return c1.compareTo(c2) * -1;//multiply -1 then default sorting is changed reverse.
		}
		return -1;
	}
}
