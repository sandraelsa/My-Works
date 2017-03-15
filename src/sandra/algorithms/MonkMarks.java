package sandra.algorithms;

import java.util.Scanner;

public class MonkMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x = sc.nextInt();
		int[] array = new int[t];
		for (int i = 0; i < t; i++) 
		{
			array[i] = sc.nextInt();
		}
		int skip=0;
		for (int k=0; k < t; k++)
		{
			
			if(array[k] <= x)
			{
				skip=skip+1;
			}
			else
			{
				skip=skip-1;
				if(skip<0)
				{
					skip=0;
				}
			}
		}
		System.out.println(skip);

	}

}
