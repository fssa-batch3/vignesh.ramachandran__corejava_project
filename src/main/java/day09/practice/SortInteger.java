
package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(8);
		numbers.add(9);
		numbers.add(45);
		numbers.add(12);
		numbers.add(1);
		
		Collections.sort(numbers);
		for (int num : numbers) {
            System.out.print(num + " ");
        }
		

	}

}
