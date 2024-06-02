package Week2.day4;

import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Integer[] number1 = new Integer[] { 3, 2, 11, 4, 6, 7};
		List<Integer> list1 = Arrays.asList(number1);
		 Integer[] number2 = new Integer[] { 1, 2, 8, 4, 9, 7};
		List<Integer> list2 = Arrays.asList(number2);
		if(list1.size() == list2.size()) {
			
			for(int i=0;i<list1.size();i++) {
				if(list1.get(i) == list2.get(i)) {
					System.out.print(list1.get(i)+" ");
					
				}
				
				
			}
			
		}
		
	}

}
