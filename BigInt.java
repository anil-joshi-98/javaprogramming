import java.util.*;
import java.math.BigInteger;
class BigInt{
	static int factorial(int t){
		if(t==0)
			return 0;
		else if(t==1 || t==2)
			return 1;
		return factorial(t-1)+factorial(t-2);
	}
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
		for(int i=0;i<t;i++)
		System.out.println(factorial(i));
	}
}