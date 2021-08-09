

import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		 int i,j,sum=0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		 int []a = new int[n];
		 for(i=0;i<n;i++)
		 {
			 a[i] = s.nextInt();
		 }
		 for(i=0;i<n;i++)
		 {
			 for(j=i+1;j<n;j++)
			 {
				sum = a[i]+a[j];
				if(m==sum)
				{
					System.out.println("yes "+a[i]+" "+a[j]+"are two numbers");
				}
			 }
		 }
		
	}

}
