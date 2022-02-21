package recursion;

public class exponention75 {

	public static int exponent(int n) {
		if (n == 0)
			return 1;
		return 2 * exponent(n-1); 
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(exponention75.exponent(n));
	}

}
