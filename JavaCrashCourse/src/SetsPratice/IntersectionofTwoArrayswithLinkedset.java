package SetsPratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class IntersectionofTwoArrayswithLinkedset {

	public static void intersections(int a[],int b[]) {
		Integer[] wrapper1 = Arrays.stream(a).boxed().toArray(Integer[] :: new);
		Integer[] wrapper2 = Arrays.stream(b).boxed().toArray(Integer[] :: new);
		
		LinkedHashSet<Integer> ls1= new LinkedHashSet<>(Arrays.asList(wrapper1));
		LinkedHashSet<Integer> ls2= new LinkedHashSet<>(Arrays.asList(wrapper2));
		System.out.println(ls1);
		System.out.println(ls2);
		ls1.retainAll(ls2);
		System.out.println(ls2);
	}	
	
	public static void main(String[] args) {
		int a[]= {10,15,20,25,30,50};
		int b[]= {30,5,15,80};
		
		intersections(a,b);
	}
}
