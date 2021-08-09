import java.util.*;
class Codeforces{
	static boolean isSort(int arr[]){
		int temp=1;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1])
			temp=0;
		}
		if(temp==1)
		return true;
		else
		return false;
	}
	
	static boolean isEqual(int arr[],int arr1[]){
		if(arr==arr1)
		return true;
		else
		return false;
	}
	
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[2*n];
		for(int i=0;i<2*n;i++)
		arr[i]=in.nextInt();
		int count=0;
		int arr1[]=arr;
		while(true){
			
		if(isSort(arr)==true)
		{
			break;
		}
		
		for(int i=0;i<2*n;i=i+2){
			arr[i]=arr[i+1];
		}
		count++;
		
		if(isEqual(arr,arr1)==true)
		{	
			count=-1;
			break;
		}
		
		for(int i=0;i<n;i++){
			arr[i]=arr[n+i];
		}
	
		if(isSort(arr)==true)
		{
			break;
		}
		
		
		}
	System.out.println(count);
}
}