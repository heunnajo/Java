import java.util.*;

class ArrayList_ex {
	public static void main(String[] args) {
		System.out.println("------------------------------------------------");
		System.out.println("add(), subList(from,to)");
		ArrayList list1 = new ArrayList(10);
		//ArrayList에는 객체만 저장가능하지만
		//autoboxing에 의해 기본형이 참조형(래퍼객체)으로 자동 형변환된다. 
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
//		list1.add(new Integer(5));
//		list1.add(new Integer(4));
//		list1.add(new Integer(2));
//		list1.add(new Integer(0));
//		list1.add(new Integer(1));
//		list1.add(new Integer(3));

		//subList : 읽기 전용!
		//subList(from,to) : extract from index1 to index3
		List sub = list1.subList(1, 4);
		ArrayList list2 = new ArrayList(sub);
		//ArrayList list2 = new ArrayList(list1.subList(1,4));  
		print(list1, list2);

		//default : ascending.
		System.out.println("------------------------------------------------");
		System.out.println("sort()");
		Collections.sort(list1);	// sort list1 and list2.
		Collections.sort(list2);	// Collections.sort(List l)
		print(list1, list2);

		System.out.println("------------------------------------------------");
		System.out.println("containsAll()");
		System.out.println("list1.containsAll(list2):"
                                               + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		System.out.println("------------------------------------------------");
		System.out.println("add(index,data)");
		list2.add(3, "A");
		print(list1, list2);

		System.out.println("------------------------------------------------");
		System.out.println("set(index,data)");
		list2.set(3, "AA");
		print(list1, list2);
		
		System.out.println("------------------------------------------------");
		System.out.println("adding string 1 at index0");
		list1.add(0,"1");//add string "1"
		print(list1, list2);
		//indexOf()는 지정된 객체의 위치(index)를 알려준다.
		System.out.println("String 1 index = "+list1.indexOf("1"));//index is 0
		System.out.println("Integer 1 index = "+list1.indexOf(new Integer(1)));//index is 2
		System.out.println("remove(0) : remove index0");
		list1.remove(0);//remove index 0!!
		print(list1, list2);
		System.out.println("remove(new Integer(1))");
		list1.remove(new Integer(1));//remove integer value 1!!
		print(list1, list2);
		System.out.println("------------------------------------------------");
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다. 
		System.out.println("");
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

		print(list1, list2);

		//  list2에서  list1에 포함된 객체들을 삭제한다. 
		for(int i = list2.size()-1; i>= 0; i--) {
			//list2의 원소를 가져와서,list1이 contains하고 있으면 list2에 해당 원소를 remove!
			//1.get(i)로 list2에서 하나씩 꺼낸다.
			//2.contains()로 꺼낸 객체가 list1에 있는지 확인한다.
			//3.remove(i)로 해당 객체를 list2에서 삭제한다.
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	} // main 끝 

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class