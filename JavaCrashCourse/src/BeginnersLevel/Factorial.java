package BeginnersLevel;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for Factorial");
		num=sc.nextInt();
		int factorial=1;
		
		while(num>=1) {
			factorial=factorial*num;
			num--;
		}
		
		System.out.println("Factorial of the num is : "+ factorial);
		
	}

}
