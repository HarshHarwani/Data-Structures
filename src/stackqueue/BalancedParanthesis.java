package stackqueue;

import java.util.Stack;

public class BalancedParanthesis {
	private static final char LEFT_PAREN = '(';
	private static final char RIGHT_PAREN = ')';
	private static final char LEFT_BRACE = '{';
	private static final char RIGHT_BRACE = '}';
	private static final char LEFT_BRACK = '[';
	private static final char RIGHT_BRACK = ']';

	public boolean isValid(String s) {
		if (s == null || s.length() == 0)
			return true;
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == LEFT_PAREN)
				st.push(LEFT_PAREN);
			else if (c == LEFT_BRACE)
				st.push(LEFT_BRACE);
			else if (c == LEFT_BRACK)
				st.push(LEFT_BRACK);
			else if (c == RIGHT_PAREN) {
				if (st.isEmpty())
					return false;
				if (st.pop() != LEFT_PAREN)
					return false;
			} else if (c == RIGHT_BRACE) {
				if (st.isEmpty())
					return false;
				if (st.pop() != LEFT_BRACE)
					return false;
			} else if (c == RIGHT_BRACK) {
				if (st.isEmpty())
					return false;
				if (st.pop() != LEFT_BRACK)
					return false;
			}
		}
		if (st.isEmpty())
			return true;
		else
			return false;

	}
}
