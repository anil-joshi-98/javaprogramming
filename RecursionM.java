import java.util.*;
class RecursionM{
    static int recursion(int x){
        if(x==0){
            return 0;
        }
        if(x==2 || x==1)
            return 1;
        else
        return recursion(x-1)+recursion(x-2);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<10;i++)
           System.out.print(recursion(i)+" ");
    }
}