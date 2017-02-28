package sandra.algorithms;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraySize = sc.nextInt();
		System.out.println("Enter sorted array");
		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) 
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search in the array");
		int elementToSearch = sc.nextInt();
		int mid = arraySize/2;
		if (array[mid] > elementToSearch)
		{
			int i=0, j=mid-1;
			for (i=0;i<=j;i++)
			{
				if (array[i]== elementToSearch)
				{
					System.out.println("Element is at index:" +i);
					break;
				}
				else
				{
					System.out.println("Element is not present in the array");
					break;
				}
			}
		}
		else
		{
			int i=mid, j=arraySize-1;
			for (i=mid;i<=j;i++)
			{
				if (array[i]== elementToSearch)
				{
					System.out.println("Element is at index: " +i);
					break;
				}
				else
				{
					System.out.println("Element is not present in the array");
					break;
				}
			}
		}
		
	}

}
