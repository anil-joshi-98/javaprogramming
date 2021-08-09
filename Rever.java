import java.util.Scanner;
class Rever{
	public static void main(String []args){
	Scanner in=new Scanner(System.in);
	float i=in.nextFloat();
    int j=(int)Math.pow(5,i);
	j=j%100;

	System.out.println(j);
	}
}