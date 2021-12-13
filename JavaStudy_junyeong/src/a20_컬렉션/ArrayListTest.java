package a20_컬렉션;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("박준영");
		arrayList.add("박준일");
		arrayList.add("박준이");
		arrayList.add("박준삼");
		arrayList.add("박준사");
		arrayList.add("박준오");
		arrayList.add("박준육");
		
		System.out.println(arrayList.get(2));
		System.out.println(arrayList);
		
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);
		
		System.out.println(arrayList.remove(2));
	}
}
