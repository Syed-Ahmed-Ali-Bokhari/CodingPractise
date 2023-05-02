package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MoveElementToEnd9 {
    // Integer[] numArray = { 2, 1, 2, 2, 2, 3, 4, 2 };
    // output {1,3,4,2,2,2,2,2}
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) { // TODO Auto-generated method stub
        int j = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != (toMove)) {
                array.set(j, array.get(i));
                j++;
            }

        }
        while (j < array.size())
            array.set(j++, toMove);
        return array;
    }


    public static void main(String[] args) {

        Integer[] numArray = {2, 1, 2, 2, 2, 3, 4, 2};
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(numArray));
        int toMove = 2;

        List<Integer> numArray1 = MoveElementToEnd9.moveElementToEnd(array, toMove);
        for (int num : numArray1)
            System.out.println(num);

    }

}
