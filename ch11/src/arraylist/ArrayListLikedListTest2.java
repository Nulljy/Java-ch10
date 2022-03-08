package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLikedListTest2 {
// ArrayList와 LinkedList의 접근시간
	
	public static void main(String[] args) {
		// 추가할 데이터의 개수들 고려하여 충분히 잡아야한다.
		ArrayList al = new ArrayList(1000000);
		LinkedList ll = new LinkedList();
		add(al);
		add(ll);
		
		System.out.println("= 접근시간 테스트 =");
		System.out.println("ArrayList :"+access(al));
		System.out.println("LinkedList :"+access(ll));
		
	}
	
	public static void add(List list) {
		for(int i=0; i<100000;i++) list.add(i+"");
	}
	
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
		
	}


}
