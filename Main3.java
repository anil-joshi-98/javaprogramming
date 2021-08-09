import java.util.*;
class Main3{
public static void main(String [] args){
	Scanner in=new Scanner(System.in);
	int x=in.nextInt();
	int y=in.nextInt();
	int arr[][]=new int[x][y];
	for(int i=0;i<x;i++){
		for(int j=0;j<y;j++)
		 arr[i][j]=in.nextInt();
	}
	for(int i=0;i<x;i++){
		int d=arr[i][0];
		arr[i][0]=arr[i][y-1];
		arr[i][y-1]=d;
	}
	for(int i=0;i<x;i++){
		for(int j=0;j<y;j++)
		 System.out.print(arr[i][j]+" ");
		 System.out.println();
	}
}
}