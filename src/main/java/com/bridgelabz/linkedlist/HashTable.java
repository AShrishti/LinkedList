package com.bridgelabz.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class HashTable {
	HashMap<String, Integer> mp;

	 void count_freq(String str) {
		// Map<Integer,String> hm= new HashMap<>();
		mp = new HashMap<String, Integer>();

		// Splitting to find the word
		String[] words = str.toLowerCase().split(" ");

		// Loop to iterate over the words
		for (String word : words)

			// Condition to check if the
			// array element is present
			// the hash-map
			if (mp.containsKey(word)) {
				// ystem.out.println(word);
				mp.put(word, mp.get(word) + 1);
			} else {
				mp.put(word, 1);
			}

		// Loop to iterate over the
		// elements of the map

		for (Map.Entry m : mp.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue() + " <-hashcode" + m.hashCode());
		}

		mp.forEach((k, v) -> System.out.println(k + "- " + v));
		System.out.println(mp);

	}

	public static void main(String[] args) {
		HashTable freq = new HashTable(); // object of current class
		freq.count_freq("To Be not to be");
		freq.count_freq(
				"Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations");
		
	}

}
