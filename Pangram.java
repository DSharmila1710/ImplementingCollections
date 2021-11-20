package test2;

import java.util.*;

public class Pangram {

	public static void main(String[] args) {
		String s ="The quick brown fox jumps over the lazy dog 123";
		System.out.println(isPangram(s));
	}

	private static boolean isPangram(String s) {
		Set<Character> set = new TreeSet<Character>();
		s = s.toLowerCase().replaceAll("[^a-z]", "");
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		return (set.size()==26);
	}

}
