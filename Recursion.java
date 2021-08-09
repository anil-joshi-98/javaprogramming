import java.util.*;
class Recursion{
    static void recursion(char a[],int i,int n){
        if(i==n){
            System.out.println();
            for(int k=0;k<n+1;k++)
            System.out.print(a[k]);
        }
        else{
            for(int j=i;j<=n;j++){
                char s=a[j];
                a[j]=a[i];
                a[i]=s;
                recursion(a,i+1,n);
                s=a[j];
                a[j]=a[i];
                a[i]=s;
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String x=in.next();
        int n=x.length()-1;
        int i=0;
        char arr[]=x.toCharArray();
        recursion(arr,i,n);
    }
}