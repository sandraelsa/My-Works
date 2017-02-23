import java.util.Scanner;
public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,a[],search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		 System.out.println("Enter integers");
		 a = new int[n];
		    for (c = 0; c < n; c++)
		      a[c] = sc.nextInt();
		 
		    System.out.println("Enter value");
		    search = sc.nextInt();
		 
		    for (c = 0; c < n; c++)
		    {
		      if (a[c] == search)  
		      {
		         System.out.println(search + " is present at location " + (c + 1) + ".");
		          break;
		      }
		   }
		   if (c == n)
		      System.out.println(search + " is not present in array.");
		  }
	}
