import java.util.Scanner;
class Important
{
	int value(int arr[]){
		int c=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(arr[j]==arr[i])
				c++;
			}
			if(c>1)
		return arr[i];
		}
		return 0;
	}
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int a[]=new int[5];
	for(int i=0;i<5;i++)
	a[i]=in.nextInt();
	System.out.println("duplicate number is ="+new Important().value(a));
}}