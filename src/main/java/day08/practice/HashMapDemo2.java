package day08.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo2 {

    public static void main(String[] args) {
        Map<String, Integer> nameCountMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String[] names = input.split(", ");

        // Count the occurrences of each name
        for (String name : names) {
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        // Print the count of each name
        for (String name : nameCountMap.keySet()) {
            int count = nameCountMap.get(name);
            System.out.println(name + ": " + count);
        }
    }

}
