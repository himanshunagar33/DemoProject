package SetsPratice;

import java.util.TreeMap;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map= new TreeMap<>();
		map.put(10, "First");
		map.put(20, "Second");
		map.put(30, "Third");
		
		System.out.println(map.ceilingEntry(25));
		System.out.println(map.floorEntry(20));
		System.out.println(map.lowerEntry(35));
		System.out.println(map.higherKey(12));
	}
}
