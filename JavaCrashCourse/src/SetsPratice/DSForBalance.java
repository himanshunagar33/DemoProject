package SetsPratice;

import java.util.HashMap;

public class DSForBalance {

	public static void main(String[] args) {
		int arr[]= {5, 6, 10 ,5,10,6,10};
		HashMap<Integer, Integer> hs= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hs.containsKey(arr[i])) {
				hs.put(arr[i], hs.get(arr[i])+1);
			}
			
			else hs.putIfAbsent(arr[i], 1);
		}
		
		System.out.println(hs);
		
	}
}
