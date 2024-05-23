package Week1.day3;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String rev= " ";
		String arr[]=test.split(" ");
		for(int i=1;i<arr.length;i=i+2) {
			rev= "";
			for (int j = 0; j < arr[i].length(); j++) {
				rev = arr[i].charAt(j) + rev;
				}
			arr[i]=rev;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
			
		}
	}

}
