import java.util.*;
class Sort{
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int x=in.nextInt();
	int arr[]=new int[x];
	for(int i=0;i<x;i++)
	arr[i]=in.nextInt();
	int k,j;
	for(int i=1;i<x;i++){
		k=arr[i];
		j=i-1;
		while(j>=0 && arr[j]>k){
		arr[j+1]=arr[j];
		arr[j]=k;
		j--;
		}
	}
	for(int i=0;i<x;i++)
	System.out.println(arr[i]);
}
}