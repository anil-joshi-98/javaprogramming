import java.util.*;
import java.io.*;
class Abs{			//generic methods
	public <e> void print(e t[]){
		for( e x:t)
	System.out.println(x);
	}
public static void main(String []args){
	Abs in=new Abs();
String []s={"hello","how","are","you"};
Integer []p={12,13,14,15,16};
in.print(s);
in.print(p);
}
}