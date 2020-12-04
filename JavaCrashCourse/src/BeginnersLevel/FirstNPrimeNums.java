package BeginnersLevel;

import java.util.Scanner;

public class FirstNPrimeNums {

	public static void main(String[] args) {
		
		int Count=4;
		int counter=0;
		boolean isPrime=true;
		int Num=2;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number of primes to be printed");
//		Count=sc.nextInt();
	while(counter<Count) {
			
			for(int i=2;i<=Num/2;i++) {
				
				if( Num % i==0 ) {
					isPrime=false;
					break;
				}
			}
			
			if(isPrime) {
				counter++;
				System.out.println(" "+Num);
			}
			Num=Num+1;
			isPrime=true;
		}

	}

}
