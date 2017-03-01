package sandra.algorithms;

import java.util.Scanner;

public class BubbleSort {

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
		int i, j, temp;
		for (i=0; i < arraySize-1; i++)
		{
			for(j=0; j <arraySize-1; j++)
			{
				if(array[j] > array[j+1])
				{
					  temp = array[j];
					  array[j] = array[j+1];
					  array[j+1] = temp;
					
				}
			}
		}
		System.out.println("Sorted array: ");
		for (i = 0; i < arraySize; i++) 
		{
			System.out.println(array[i]);
		}

	}

}
