package sandra.algorithms;

import java.util.Scanner;

public class LuckyMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0; i<t; i++)
		{
			int n = sc.nextInt();
			int[] array = new int[n];
			for(int j=0; j<n; j++)
			{
				array[j] = sc.nextInt();
			}
			min(n,array);			
		}
	}
	public static void min(int n, int array[]){
		int minimum = array[0],sum=0;
		for (int j=0; j<n; j++)
		{
			if(array[j]< minimum)
			{
				minimum = array[j];
			}
		}
		for (int k=0; k<n; k++)
		{
			if(array[k]== minimum)
			{
				sum=sum+1;
			}
		}
		if (sum % 2==0)
		{
			System.out.println("Unlucky");
		}
		else
		{
			System.out.println("Lucky");
		}
	}
}
