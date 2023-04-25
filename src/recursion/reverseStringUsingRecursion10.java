package recursion;

public class reverseStringUsingRecursion10 {

    // Reverse words in a String

    public static String reverse(String sentence) {
        if (sentence.isEmpty())
            return sentence;

        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }

    public static void main(String[] args) {
        String sentence = "work";
        String reversed = reverse(sentence);
        System.out.println("The reversed sentence is: " + reversed);

    }
/*
    void reverse(string& str, int i, int j ) {

        cout << "call recieved for " << str << endl;

        //base case
        if(i>j)
            return ;

        swap(str[i], str[j]);
        i++;
        j--;

        //Recursive call
        reverse(str,i,j);

    }
    */
}
