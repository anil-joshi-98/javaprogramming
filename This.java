import java.util.*;
class This{
    static int i=1;
    public static void printNos(int N)
    {   
        if(N>0){
            System.out.print(i+" ");
            i++;
            N--;
            printNos(N);
        }
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        printNos(n);
    }
        
}