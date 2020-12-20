package StringRelatedIssues;

public class PanagramCheck {

	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
		printPanagramOrnot(str);
		}
		
	public static void printPanagramOrnot(String str) {
		String abc="abcdefghijklmopqrstuvwxyz";
		boolean flag=true;
		
		
		for(int i=0; i<abc.length();i++) {
			String temp=Character.toString(abc.charAt(i));
			if(!str.toLowerCase().contains(temp)) {
				flag=false;
				break;
				}
		}
		if(!flag) 
			System.out.println(str +" is a not panagram");
		
		else
				System.out.println(str + " is a panagram");
				
		
	}
}
