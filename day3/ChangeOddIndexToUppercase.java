package Week1.day3;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String test="changeme";
	  //Converted String to Char Array
	  char ch[]=test.toCharArray();
	  //filtering odd indexes
	  for(int i=1;i<ch.length;i=i+2) {
		 ch[i]= Character.toUpperCase(ch[i]);
	  }
     System.out.println(String.valueOf(ch));
	}

}
