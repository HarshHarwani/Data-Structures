package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * For example, Given "egg", "add", return true.
 * 
 * Given "foo", "bar", return false.
 * 
 * Given "paper", "title", return true.
 * 
 * @author HarshHarwani
 *
 */
public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		if (s.length() == 0 && t.length() == 0)
			return true;
		else if (s.length() != t.length())
			
			return false;
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			Character c = getKey(map, c2);
			if (c != null && c != c1) {
				return false;
			} else if (map.containsKey(c1)) {
				if (c2 != map.get(c1))
					return false;
			} else {
				map.put(c1, c2);
			}
		}
		return false;
	}

	private Character getKey(Map<Character, Character> map, char c) {
		for (char k : map.keySet()) {
			if (c == map.get(k)) {
				return k;
			}
		}
		return null;
	}
}
