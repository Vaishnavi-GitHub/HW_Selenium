package Week2.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numbers= new Integer[] {3, 2, 11, 4, 6, 7};
		List<Integer> numbersList=Arrays.asList(numbers);
		Collections.sort(numbersList);
		System.out.println("The second largest number is "+numbersList.get(numbersList.size()-2));

	}

}
