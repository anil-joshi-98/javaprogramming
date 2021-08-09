import java.util.*;
class New1{
    public long largest(long arr[], long n)
    { 	long temp=0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i])
            temp=arr[i+1];
        }
        return temp;
    }
public static void main(String []args){
	Scanner in=new Scanner(System.in);
	long arr[]={1,2,3,42,13};
	long r=new New1().largest(arr,5);
	System.out.println(r);
}
}