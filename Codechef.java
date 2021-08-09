/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int[] y=new int[x];
    for(int i=0;i<x;i++)
    y[i]=in.nextInt();
    for(int i=0;i<x;i++)
    {   int c=y[i];
		int p=0;
        while(c!=0){
            p=p*10+c%10;
            c=c/10;
        }
        System.out.println(p);
    }
    }
}
