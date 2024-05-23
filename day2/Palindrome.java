package Week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static int IsPalindrome(int num) {
		int rem=0;int sum=0;
		for(int i=num;i>0;i=i/10) {
			rem=i%10;
			sum=(sum*10) + rem;
			
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int x=IsPalindrome(num);
		if(x==num) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
