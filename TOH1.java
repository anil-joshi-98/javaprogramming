import java.util.Scanner;
class TOH1{
    static void toh(int n,String b,String a,String d){
        if(n>=1){
            toh(n-1, b, d, a);
            System.out.println(b + " to "+d);
            toh(n-1,a,a,d);
        }
    }
    public static void main(String[] args){
        int n=in.nextInt();
        String a="start";
        String b="beginning";
        String d="destination";
        toh(n,b,a,d);
    }
}