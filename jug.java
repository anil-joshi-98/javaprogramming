import java.util.*;
class jug{
    static int fact(int x){
        if(x==0 || x==1){
            return 1;
        }
        return x*fact(x-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.println(fact(x));
    }
}