package practice;


import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		
		List<List<String>> list = new ArrayList<List<String>>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("india");
		list1.add("USA");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("rupee");
		list2.add("dollars");
		
		list.add(list1);
		list.add(list2);
		
		String d = list.get(1).get(1);
		System.out.println(d);
		
	}
}
