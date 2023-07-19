package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDuplicates {

	public static void main(String[] args) {
		
		List<Integer> city = new ArrayList<Integer>();
		city.add(111);
		city.add(112);
		city.add(113);
		city.add(114);
		city.add(113);
		
		System.out.println("All cities" + city);
		
		Set<Integer> cityNames = new HashSet<Integer>(city);
		System.out.println("Distinct cities" +cityNames);

	}

}
