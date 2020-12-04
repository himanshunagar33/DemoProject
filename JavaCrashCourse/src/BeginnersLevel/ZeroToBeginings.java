package BeginnersLevel;

import java.util.ArrayList;

public class ZeroToBeginings {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(0);
		list.add(20);
		list.add(4);
		list.add(0);
		list.add(0);
		list.add(9);
		System.out.println(list);
		
	
	for(int j=0;j<list.size();j++) {
	for(int i=list.size()-1;i>0;i--) {
		if(list.get(i)==0) {
			int temp=list.get(i-1);
			list.set(i-1, list.get(i));
			list.set(i, temp);
		}
	}
	}
	System.out.println(list);
	
	}
}
