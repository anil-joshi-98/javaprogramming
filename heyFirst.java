import java.util.Scanner;
class heyFirst{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
        int n=in.nextInt();
        int temp=0;
        int sum=0;
        temp=temp+n%10;
        n=n/10;
        while(n>0){
            sum=n;
            n=n/10;
        }
        temp=temp+sum;
        System.out.println(temp);
    }
}
}