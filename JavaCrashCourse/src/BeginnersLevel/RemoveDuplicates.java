package BeginnersLevel;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Character> arr= new  ArrayList<Character>();
		arr.add('a');
		arr.add('b');
		arr.add('b');
		arr.add('c');
		arr.add('c');
		arr.add('c');
		arr.add('d');
		
		System.out.println(arr);
		
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i)==arr.get(j)) {
					arr.remove(j);
					j--;
				}
			}
		}
		
		System.out.println(arr);
		
	}
}
