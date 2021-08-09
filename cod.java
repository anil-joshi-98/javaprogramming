import java.util.*;
class cod{
public static void rearrange(int arr[], int n){
        int temp,l=0,m=0;
        ArrayList<Integer> max=new ArrayList<>();
        ArrayList<Integer> min=new ArrayList<>();
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            int temp1=arr[i];
            for(int j=0;j<arr.length;j++){
            if(temp<arr[j]){
           
                temp=arr[j];
            }
            if(temp1>arr[j]){
              
                temp1=arr[j];
            }
            }
           /* arr[m]=0;
            arr[l]=0;
			*/
            max.add(temp);
            min.add(temp1);
        }
        int k=0,p=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(max.get(k)+" ");
                k++;
            }
            else{
                System.out.print(min.get(p)+" ");
                p++;
            }
        }
    }
public static void main(String[] args){
	/*
int x=15;
int y=0;
//int y=String.valueOf(x).length();
//int y=(int)(Math.log10(x)+1);
while(x>0){
	y=x%2;
	x=x/2;
System.out.println(y);
}
int arr[]={1,2,3,4};
int arr2[]=arr;
for(int i:arr2)
System.out.print(i+" ");
*/
int arr[]={1,2,3,4,5,6};
rearrange(arr,arr.length);
}
}