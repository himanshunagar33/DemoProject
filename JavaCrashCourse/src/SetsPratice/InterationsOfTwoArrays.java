package SetsPratice;

public class InterationsOfTwoArrays {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {30,20,10};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+ " ");
				}
			}
		}
	}
}
