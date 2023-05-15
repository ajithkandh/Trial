package maths2;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		int[] a= {10,20,60,43,28,99,76,83};
		System.out.println("Before sort"+Arrays.toString(a));
		//Arrays.parallelSort(a);
		//System.out.println("After sort"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sort"+Arrays.toString(a));

	}

}
