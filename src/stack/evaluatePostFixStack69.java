package stack;

import java.util.Stack;

public class evaluatePostFixStack69 {

	public static Integer evaluate(String str) {
		Stack<Integer> newStack = new Stack<Integer>();

		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			if (!Character.isDigit(character)) {
				Integer a = newStack.pop();
				Integer b = newStack.pop();

				switch (character) {

				case '+':
					newStack.push(b + a);
					break;
				case '-':
					newStack.push(b - a);
					break;
				case '/':
					newStack.push(b / a);
					break;
				case '*':
					newStack.push(b * a);
					break;

				}
			} else
				newStack.push(Character.getNumericValue(character));

		}

		return newStack.pop();

	}

	public static void main(String[] args) {
		Integer result = evaluatePostFixStack69.evaluate("53+62/*35*+");
		System.out.println(result);
	}

}
