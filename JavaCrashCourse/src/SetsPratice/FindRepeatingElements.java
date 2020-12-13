package SetsPratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindRepeatingElements {

	public static void main(String[] args) {
		Integer arr[]= {10,20,10,7,9,7,6};
//		int ary[] = {50,30,62,50,30};
//		Integer[] Wrapper = Arrays.stream(ary).boxed().toArray(Integer[]:: new);
		
		Set<Integer> hs = new HashSet<Integer>();
		
		for(int itr: arr) {
			if(hs.contains(itr)) {
				System.out.println(itr);
			}
			else {
				hs.add(itr);
			}
		}
		
	}
}