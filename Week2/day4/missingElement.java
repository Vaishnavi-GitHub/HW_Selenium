package Week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class missingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] elements= new Integer[] {1, 2, 3, 4, 10, 6, 8};
		List<Integer> elementList=Arrays.asList(elements);
		Collections.sort(elementList);
		for(int i=0;i<elementList.size()-1;i++) {
			if(elementList.get(i) +1 != elementList.get(i+1) ) {
				System.out.println(elementList.get(i) +1);
				
			}
			
		}
		

	}

}
