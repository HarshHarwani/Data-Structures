package strings;

public class NeedleInHayStack {
	public static int strStr(String haystack, String needle) {
		if (haystack.length() == 0 || needle.length() == 0)
			return 0;
		if (needle.length() == 0)
			return 0;
		for (int i = 0; i < haystack.length(); i++) {
			// checking the condition when there is not enough characters left
			// in the main string
			if (i + needle.length() > haystack.length())
				return -1;
			int m = i;
			for (int j = 0; j < needle.length(); j++) {
				if (needle.charAt(j) == haystack.charAt(m)) {
					// if we have reached till the end of needle then return the
					// i'th index from where the matching started
					if (j == needle.length() - 1)
						return i;
					// as long as it is matching move onto next character in
					// both the strings
					m++;
				} else {
					break;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(strStr("harshharwani","rs"));
	}
	
}
