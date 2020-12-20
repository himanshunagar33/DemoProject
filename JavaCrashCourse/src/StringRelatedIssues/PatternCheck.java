package StringRelatedIssues;

public class PatternCheck {

	public static void main(String[] args) {
		String str= "Welcome to the world of geeks";
		String words="world";
		patterncheck(str,words);
	}
	
	static void patterncheck(String str, String word) {
		
		int index=0;
		while((index>=0)) {
		index=str.indexOf(word,index);
		
		if(index>=0) {
			System.out.print(index+" ");
			index++;
		}
		else break;
		
		}
	}
}
