package sandra.algorithms;

import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0; i<t; i++)
		{
			int n = sc.nextInt();
			int[] array = new int[n];
			int k = sc.nextInt();
			for(int j=0; j<n; j++)
			{
				array[j] = sc.nextInt();
			}
			min(n,array,k);			
		}
	}

	public static void min(int n, int array[],int k){
		int minimum = array[0],sec;
		for (int j=0; j<n; j++)
		{
			if(array[j]< minimum)
			{
				minimum = array[j];
			}
		}
		if(minimum > k)
		{
			sec=0;
			System.out.println(sec);
		}
		else
		{
			sec=k-minimum;
			System.out.println(sec);
		}
		
		
	}
}

