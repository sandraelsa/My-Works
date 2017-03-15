package sandra.algorithms;

import java.util.Scanner;

public class Biased {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int sum=0;
		for (int i = 0; i < n; i++) 
		{
			array[i] = sc.nextInt();
			sum=sum+array[i];
			if(array[i]==0 && i!=0)
			{
				sum=sum-array[i-1];
			}
		}
		System.out.println(sum);
	}

}
