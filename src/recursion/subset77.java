package recursion;

public class subset77 {

	// Reverse words in a String

	public static void subset(String str, int index, String output) {
		if (index == str.length()) {
			System.out.println(output);
			return;
		}
		subset(str, index+1, output);
		
		char st=str.charAt(index);
		
		output=output.concat(String.valueOf(st));
		subset(str, index+1, output);
		
	}

	public static void main(String[] args) {

		String str = "abc";
		int index = 0;
		String output = "";
		subset77.subset(str, index, output);

	}

}
