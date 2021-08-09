package tree;
import java.math.*;
import java.util.Scanner;
public class Master {
	static int facti(long num) {
		int ob=0;
		long temp=1;
		for(long i=num;i>=1;i--) {
			temp=temp*i;
			if(temp%10==0) 
			{	ob++; 
				temp=temp/10;
			}
		}
		return ob;
		}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		long x=in.nextLong();
		System.out.println(facti(x));
	}
}
