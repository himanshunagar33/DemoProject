package BeginnersLevel;

public class SortingArray {

	public static void main(String[] args) {
		int arr[]= {4,3,5,6,2};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j+1];
				arr[j+1]= arr[j];
				arr[j]=temp;
			}
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+ " ");
		}
	}
}
