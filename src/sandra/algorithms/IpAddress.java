package sandra.algorithms;

import java.util.Scanner;

public class IpAddress {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the IP Address");
		s= sc.nextLine();
		int flag=0;
		for( String parts: s.split("\\."))
		{
			if(parts==null)
			{
				flag=1;
			}
			else
			{
				int n = Integer.parseInt(parts);
				if (n < 0 || n > 255)
				{
					
					flag=1;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		sc.close();
	}

}
