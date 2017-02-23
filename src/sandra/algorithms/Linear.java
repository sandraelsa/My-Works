package sandra.algorithms;

import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int arraySize = sc.nextInt();

		System.out.println("Enter the array");
		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Enter the element to search in the array");
		int elementToSearch = sc.nextInt();
		int index = linearSearch(array, elementToSearch);

		if (index != -1) {
			System.out.println("element is present at index: " + index);
		} else {
			System.out.println("element is not present in the array");
		}

		sc.close();
	}

	/**
	 * method to do linear search on an array
	 * 
	 * @param array
	 * @param elementToSearch
	 * @return -1 if element is not present in the array else return the index
	 *         of the element in the array
	 */
	private static int linearSearch(int[] array, int elementToSearch) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == elementToSearch) {
				return index;
			}
		}
		return -1;
	}
}
