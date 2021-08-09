import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		int s=1;
		int temp=0,a=0,b=0;
		while(n>0){
		    a+=scan.nextInt();
		    b+=scan.nextInt();
		    int lead=Math.abs(b-a);
		    if(temp<lead && b>a)
		    {
		        s=2;
		        temp=lead;
		    }
		    if(lead>temp && a>b){
		        s=1;
		        temp=lead;
		    }
		    n--;
		}
		System.out.print(s+" "+temp);
	}
}
