package Week1.day1;

import java.util.Scanner;

public class IsPrime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int count=1;
		//Finding the factors
		for(int i=1; i<=num/2; i++) {
			if(num % i ==0) {
				count++;
			}			
		}
		//System.out.println(count);
		// Prime Numbers' Factors: 1 and itself. 
		//When no. of factors >2 - Not Prime
		if(count >2) {
			System.out.println("The number is not Prime");
		}
		else if(num==0 || num ==1) {
			System.out.println("The number is  not Prime");
		}
		else {
			System.out.println("The number is  Prime");
			
		}
		

	}

}
