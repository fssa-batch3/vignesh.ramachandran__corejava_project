package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
// Add logic to remove the duplicate Array and 
// store the unique city name is an another ArrayList

		List<String> newCityList = new ArrayList<String>();
		for(int i=0; i<cityList.size(); i++) {
			boolean isDistinct = true;
			for(int j=0; j<i; j++) {
				
				if(cityList.get(i) == cityList.get(j)) {
					isDistinct = false;
					break;
				}
				
			}
			if(isDistinct) {
				newCityList.add(cityList.get(i));
			}
		}
		System.out.println(newCityList);
	}

}
