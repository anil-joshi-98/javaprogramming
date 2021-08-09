import java.util.Scanner;
class TOH{
    static void toh(int n,String b,String a,String d){
        if(n>=1){
            toh(n-1, b, d, a);
            System.out.println(b + " to "+d);
            toh(n-1,a,a,d);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String a="Auxiliary";
        String b="beginning";
        String d="destination";
        toh(n,b,a,d);
    }
}