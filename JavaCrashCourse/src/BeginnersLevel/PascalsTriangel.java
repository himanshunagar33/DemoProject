package BeginnersLevel;

public class PascalsTriangel {

	public static void main(String[] args) {
		int n=5;
		int arr[][]= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[0][0]=0;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n;j++) {
				if((j==0)||(j==i)){
					arr[i][j]=1;
				}
				else if((i>=2)&&(j<i)){
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
					
				}
				
				//System.out.print("1 ");
			}
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
