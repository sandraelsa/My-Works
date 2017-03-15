package sandra.algorithms;

import java.util.Scanner;

public class AtmQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) 
		{
			array[i] = sc.nextInt();
		}
		int num=1;
		for(int j=0; j<arraySize-1; j++)
		{
			if (array[j]>array[j+1])
			{
				num= num+1;
			}
		}
		System.out.println(num);
	}

}
