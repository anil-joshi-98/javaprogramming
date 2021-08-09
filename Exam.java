import java.util.*;
import java.lang.*;
import java.io.*;
class Exam{
	public static void main (String[] args) {
    	Scanner in=new Scanner(System.in);
		int arr[]=new int[10000000];
		int ar[]=new int[10000];
    	int t=in.nextInt();
    	while(t-->0){
    	    int n=in.nextInt();
			int d=in.nextInt();
			for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
    	    for(int i=0;i<d;i++)
			ar[i]=arr[i];
			for(int i=d;i<n;i++)
			arr[i-d]=arr[i];
			for(int i=0;i<d;i++)
			arr[i+d+1]=ar[i];
			for(int i=0;i<n;i++)
    	    System.out.printf(arr[i]+"\t");
    	}
	}
}