package StringRelatedIssues;

import java.util.HashMap;

public class AnagramCheck {

	public static void main(String[] args) {
		String str1="silent";
		String str2="listen";
		
		checkAnagram(str1, str2);
		
	}
	public static void checkAnagram(String S1,String S2) {
		if(S1.length()==S2.length()) {
		HashMap<Character,Integer> hs1= new HashMap<>();
		HashMap<Character,Integer> hs2= new HashMap<>();
		
		for(int i=0;i<S1.length();i++) {
			hs1.put(S1.charAt(i), hs1.getOrDefault(S1.charAt(i),0)+1);
		}
		
		for(int i=0;i<S2.length();i++) {
			hs2.put(S2.charAt(i), hs2.getOrDefault(S2.charAt(i),0)+1);
		}
		
		if(hs1.equals(hs2)) {
			System.out.println("Anagram");
		}
		else
			System.out.println("Not an Anagram");
	}
}
}
