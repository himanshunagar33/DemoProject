package DataStructures;

public class BinarySearch {

	public static int binarysearch(int []arr, int target) {
		int min=0;
		int max=arr.length-1;
		int guess;
		int i=1;
		while(i>0) {
			
			if(max<min) {
				i=0;
				return -1;
			}
			guess=(max+min)/2;
			if(arr[guess]==target) {
				return guess;
			}
			
			if(arr[guess]<target) {
				min=guess+1;
			}
			else if(arr[guess]>target) {
				max=guess-1;
			}
		}
		return i;
		
	}
	
	public static void main(String[] args) {
		
		int []arr= {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
		int index= binarysearch(arr,41);
		
		System.out.println("Position in the array is : "+(index+1));
	}
	
	
}
