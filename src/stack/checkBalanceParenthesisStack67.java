package stack;

import java.util.Stack;

public class checkBalanceParenthesisStack67 {

	public static Boolean check(String arr) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < arr.length(); i++) {
			Character character = arr.charAt(i);
			if (character == '}' || character == ']' || character == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				if ((character == '}' && stack.pop() != '{' ) || (character == ')' && stack.pop() != '(' )
						|| (character == ']' && stack.pop() != '[') ) {
					return false;
				}
			} else
				stack.push(character);
		}
		if (!stack.isEmpty()) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

		Boolean result = checkBalanceParenthesisStack67.check("{[()]}");
		System.out.println(result);
	}

}
