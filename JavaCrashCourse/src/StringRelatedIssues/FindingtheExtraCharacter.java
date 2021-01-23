package StringRelatedIssues;

public class FindingtheExtraCharacter {

	public static void main(String[] args) {
		String a = "abcde";
		String b = "abcdef";
		
		for(int i=0;i<b.length();i++) {
			String temp=Character.toString(b.charAt(i));
			if(!(a.contains(temp))) {
				System.out.println(temp);
			}
			
		}
	}
}
