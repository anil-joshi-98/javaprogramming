import java.io.*;
import java.util.*;
class Code{
static int t;
public static void main(String []args){
Scanner in=new Scanner(System.in);
boolean c=true;
while(c){
	int i=in.nextInt();
	if(i!=42)
	System.out.println(i);
	else
	c=false;
}
}
}
