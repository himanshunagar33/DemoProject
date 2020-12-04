package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PerviousListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		 
		ListIterator<Integer> itr= list.listIterator();
		while(itr.hasNext()) {
			itr.add(5);
			itr.next();
		}
		
		System.out.println(list);
	}
}
