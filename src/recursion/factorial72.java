package recursion;

public class factorial72 {

	public static int factorial(int n) {
		if (n == 0 || n == 1)
			return n;

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial72.factorial(n));
	}

}