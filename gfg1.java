/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class gfg1{
    static int min(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp>arr[i])
            temp=arr[i];
        }
        return temp;
    }
    static int max(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(temp<arr[i])
            temp=arr[i];
        }
        return temp;
    }
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		int arr[]=new int[s];
	    for(int i=0;i<s;i++)
	    arr[i]=in.nextInt();
	    System.out.println("Minimum element is "+min(arr));
	    System.out.println("Maximum element is "+max(arr));
	}
}