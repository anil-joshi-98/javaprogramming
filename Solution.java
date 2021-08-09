import java.io.*;
import java.util.*;
import java.lang.Math;
class Solution {
    public static int minimumWithdrawal(int[] ATM,int X){
        int temp=0,count=0;
        int i=0;
		int t=(ATM.length-1);
		code:
       while(t!=0 || temp<X){
           temp=temp+ATM[i];
		   if(temp>=X)
               break code;
           i++;
		   t--;
           count++;
           
       }
        if(temp<X){
            count=-1;
        }
		else if(temp==X)
		count=count;
		
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] ATM = new int[N];
        for(int j=0;j<N;j++){
            ATM[j]=scan.nextInt();
        }
        int X;
        X=scan.nextInt();
        int result;
        result = minimumWithdrawal(ATM,X);
        System.out.print(result);
        return ;
    }
}