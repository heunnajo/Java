import java.util.*;

class IteratorTest {
	public static void main(String[] args) {
		//Once you set reference type as Collection
		//Even though the object is List/Set.
		//Those implemented common classes.
		Collection list = new HashSet();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	} // main
}