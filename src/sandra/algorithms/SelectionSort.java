package sandra.algorithms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraySize = sc.nextInt();
		System.out.println("Enter array");
		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) 
		{
			array[i] = sc.nextInt();
		}
		System.out.println("sorted arrray:");
		int i, j, min, temp;
		for (i=0; i < arraySize-1; i++)
		{
			min = i;
			for(j=i+1; j < arraySize; j++)
			{
				if(array[j] < array[min])
				{
					min = j;
				}
			}
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		for (i = 0; i < arraySize; i++) 
		{
			System.out.println(array[i]);
		}

	}

}
