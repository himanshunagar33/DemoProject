package DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class G1example {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(25);
		al.add(10);
		al.add(63);
		al.add(18);
		al.add(5);
		Collections.sort(al);
		System.out.println(al);
	}
}
