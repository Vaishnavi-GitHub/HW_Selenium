package Week1.day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int firstNumber=0; int secondNumber=1;
		System.out.print(firstNumber + " " +secondNumber+ " ");
		for(int i=0;i<n-2;i++) {
			int res= firstNumber + secondNumber;
			System.out.print(res + " ");
			firstNumber=secondNumber;
			secondNumber=res;
			
		}
		
     
	}

}
