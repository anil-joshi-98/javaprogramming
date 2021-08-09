

import java.util.Scanner;
class Largest{
	boolean search(int a[],int s){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				return true;
			}
		}
		return false;
	}
	int great(int a[]){
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]>temp)
				temp=a[i];
		}
		return temp;
	}
	void sort(int a[])
	{	int temp=0;
		for(int i=0;i<5;i++)
		{	
			for(int j=i+1;j<5;j++){
				if(a[i]<a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
	}
	void remove(int []a){
		int []s=new int[5];
		int k=0;
		for(int i=0;i<5;i++){
			int c=0;
			for(int j=0;j<5;j++) {
				if(a[i]==a[j])
					c++;
			}if(c==1)
			{ 
				s[k]=a[i];
				k++;
				
			}else
			a[i]=0;
		}
		System.out.println();
		for(int i=0;i<k;i++)
		System.out.println(s[i]);
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		a[i]=in.nextInt();
		//System.out.println("Enter a number you want to search");
		//int s=in.nextInt();
		//System.out.println("answer is ="+new Largest().great(a));
		new Largest().remove(a);
		
//		System.out.println();
//		for(int i=0;i<5;i++)
//		System.out.println(a[i]);
	}
}
