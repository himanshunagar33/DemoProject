package DataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JosephusPrbUsingLList {

	public static int josephusmethod(LinkedList<Integer> list, int k) {
		Iterator<Integer> itr= list.iterator();
		
		while (list.size()>1) {
			int count =0;
			while(count<k) {
				while(itr.hasNext() && count<k) {
					itr.next();
					count++;
				}
				if(count<k) {
					itr= list.iterator();
					itr.next();
					count++;
				}
			}
			itr.remove();
			System.out.println(" List after one removal : " +list);
		}
		return list.getFirst();
	}
	public static void main(String[] args) {
		int n=7;
		int k=3;
		LinkedList<Integer> ls= new LinkedList<>();
		for(int i=0; i<n;i++) {
			ls.add(i);
		}

		System.out.println(" Linked List is : " + ls);
		
		int survivor=josephusmethod(ls,k );
		System.out.println("The Survivor element is : " + survivor);
		

	}

}
