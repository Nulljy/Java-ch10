package arraylist;

import java.util.*;

public class ArrayListEx01 {
// ArrayList의 기본적인 메서드를 이용해서 객체를 다루는 방법
	// 정렬, 요소 포함, 객체 저장, 객체변경, 가지고 있는지 확인
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // 생성자
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		list1.add(3);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		list2.add(6);
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i= list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		list2.remove(new Integer(6)); // "6"은 안없어지고, int타입의 6은 제거된다.
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}

}
