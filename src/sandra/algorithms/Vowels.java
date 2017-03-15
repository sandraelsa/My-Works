package sandra.algorithms;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {	
		String s;
		Scanner sc = new Scanner(System.in);
		int count1;
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) 
		{
			s= sc.nextLine();
			int length=s.length();
			int count=0;
			for(int j=0; j < length; j++)
			{
				if ((s.charAt(j) == 'a') || (s.charAt(j) == 'e') ||(s.charAt(j) == 'i') ||(s.charAt(j) == 'o') ||(s.charAt(j) == 'u') ||(s.charAt(j) == 'A') 
						||(s.charAt(j) == 'E') ||(s.charAt(j) == 'I') ||(s.charAt(j) == 'O') ||(s.charAt(j) == 'U'))
				{
					count=count+1;
				}
			}
			System.out.println(count);
		}
	}
}
