package recursion;

public class fibonacci83 {

	public static int fibonacci(int n) {
		if (n == 0 || n == 1)
			return n;

		return fibonacci(n - 2) + fibonacci(n - 1);
	}

	public static void main(String[] args) {
		int n = 6;
		System.out.println(fibonacci83.fibonacci(n));
	}

}
