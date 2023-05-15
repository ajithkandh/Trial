package maths2;

import java.util.Arrays;
import java.util.Collections;

public class Bubble_sort_reverse {

	public static void main(String[] args) {
		Integer[] a= {10,20,60,43,28,99,76,83};
		System.out.println("Before sort"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After sort"+Arrays.toString(a));

	}

}
