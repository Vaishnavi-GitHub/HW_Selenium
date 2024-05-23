package Week1.day1;

import java.util.Scanner;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i % 2 ==1) {
				System.out.print(i+ " ");
				
			}
			
		}

	}

}
