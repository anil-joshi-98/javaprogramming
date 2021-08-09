import java.io.*;
import java.lang.*;
class Outer{
	int money,m;
	void fun(int money)throws Exception{
	this.money=money;
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	m=Integer.parseInt(in.readLine().trim());
	if(m>money)
	throw new ArithmeticException("not enouth balance");
	else
	System.out.println("new account balance = "+(money-m));
			}
}
class Main{
	public static void main(String []args)throws Exception{
		Outer in1=new Outer();
		in1.fun(40000);
		
	}
}