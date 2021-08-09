import java.util.*;
import java.io.*;
interface hello{
void h1();
private void h3(){
	System.out.println("private member of an interface");
}
default void h2(){
	h3();
	System.out.println("this is default function in an interface");
}
}
class Deepak implements hello{
	public void h1(){
		System.out.println("this is a public function of an interface");
	}
public static void main(String []args)throws Exception{
	hello n=new Deepak();
	Scanner in=new Scanner(System.in);
	n.h1();
	System.out.println("enter the size of array");
	int x=in.nextInt();
	int []a=new int[x];
	for(int i=0;i<x;i++)
	a[i]=in.nextInt();
	int c=0;
	System.out.println("enter the number you want to delete");
	int p=in.nextInt();
	for(int i=0;i<x;i++)
	{	
		if(a[i]==p)
		c=i;
	}
	for(int i=c;i<x-1;i++)
	a[i]=a[i+1];
	for(int i=0;i<x-1;i++)
	System.out.println(a[i]);
	n.h2();
}
}
