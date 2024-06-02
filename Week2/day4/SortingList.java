package Week2.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] companies= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> companyList=Arrays.asList(companies);
		Collections.sort(companyList);
		System.out.println(companyList);
		Collections.reverse(companyList);
		System.out.println(companyList);
		

	}

}

