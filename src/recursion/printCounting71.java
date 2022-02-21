package recursion;

public class printCounting71 {

	public static void count(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		count(n - 1);

	}

	public static void main(String[] args) {
		int n = 5;
		printCounting71.count(n);
	}

}
