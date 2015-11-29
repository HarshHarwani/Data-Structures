package strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * 
 * Here follow means a full match, such that there is a bijection between a
 * letter in pattern and a non-empty word in str.
 * 
 * Examples: pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false. pattern =
 * "aaaa", str = "dog cat cat dog" should return false. pattern = "abba", str =
 * "dog dog dog dog" should return false.
 * 
 * @author HarshHarwani
 *
 */
public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
		Map<Character, String> map = new HashMap<Character, String>();
		String[] strArr = null;
		if (str != null) {
			strArr = str.split(" ");
		}
		if (pattern.length() != strArr.length)
			return false;
		for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(pattern.charAt(i))) {
				String val = map.get(pattern.charAt(i));
				if (!strArr[i].equals(val))
					return false;
			} else if (!map.containsKey(pattern.charAt(i)) && map.containsValue(strArr[i])) {
				return false;
			} else {
				map.put(pattern.charAt(i), strArr[i]);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
		System.out.println(wordPattern("abba", "dog cat cat fish"));
		System.out.println(wordPattern("aaaa", "dog cat cat dog"));
		System.out.println(wordPattern("abba", "dog dog dog dog"));
	}
}
