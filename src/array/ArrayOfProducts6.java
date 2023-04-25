package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayOfProducts6 {

	// Array of product {5,1,4,2} ==> {8,40,10,20}

	public static int[] arrayOfProducts(int[] array) {
		int[] product = new int[array.length];
		int left = 1;
		for (int i = 0; i < array.length; i++) {
			product[i]=left;
			left*=array[i];
		}
		int right=1;
		for (int i = array.length - 1; i >= 0; i--) {
			product[i]*=right;
			right*=array[i];
		}
		return product;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 5, 1, 4, 2 };

		int[] result = ArrayOfProducts6.arrayOfProducts(array);
		for (int res : result)
			System.out.println(res);

	}

}
