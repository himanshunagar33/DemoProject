package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VerticalSumArray {

	public static ArrayList<Integer> verticalSum(ArrayList<ArrayList<Integer>> arr ){
		int largest =0;
		ArrayList<Integer> al= new ArrayList<>();
		List<Integer> list = new ArrayList<Integer>();
		Iterator<ArrayList<Integer>> itr= arr.iterator();
		while(itr.hasNext()) {
			list.add(itr.next().size());
		}
		largest= Collections.max(list);
		
		for(int i=0;i<largest;i++) {
			//Iterator<ArrayList<Integer>> itr= arr.iterator();
			int sum=0;
			for(int j=0;j<3;j++) {
				if(arr.get(j).size()>i) {
				sum= sum+arr.get(j).get(i);
			}
			}
			al.add(sum);
		}
		
		return al;
	}
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> al = new ArrayList<>( Arrays.asList(1,2,3,4));
		ArrayList<Integer> a2 =  new ArrayList<>( Arrays.asList(5,6));
		ArrayList<Integer> a3 =  new ArrayList<>( Arrays.asList(7,8,9));
		
		arr.add(al);
		arr.add(a2);
		arr.add(a3);
		
		ArrayList<Integer> are= verticalSum(arr);
		
		System.out.println(are);
	}
}
