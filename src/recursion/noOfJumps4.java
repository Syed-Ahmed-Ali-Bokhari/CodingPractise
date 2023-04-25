package recursion;

public class noOfJumps4 {

    // Reverse words in a String

    	public static int jump(int n) {
		if (n < 0)
			return 0;
		if (n == 0 || n == 1)
			return 1;
		return jump(n-1)+jump(n-2)+jump(n-3);
	}

    public static void main(String[] args) {

		int n = 3;
		int result = noOfJumps4.jump(n);
		System.out.println(result);

    }

}
