package recursion;

public class printSpelling74 {

	public static void print(int n, String[] str) {
		if (n == 0)
			return;
		print(n/10,str);
		System.out.println(str[n%10]);
		
	}

	public static void main(String[] args) {
		String[] str = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		int n = 432;
		printSpelling74.print(n, str);
	}

}
