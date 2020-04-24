package ch6;

import java.util.Arrays;

public class ArrayShuffleEx {

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}

	public static int[] shuffle(int[] arr) {

		for (int i = 0; i < arr.length * 2; i++) {
			int a = (int) (Math.random() * arr.length);
			int b = (int) (Math.random() * arr.length);

			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;

		}

		return arr;
	}

}
