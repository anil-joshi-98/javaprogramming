import java.util.Scanner;
class Codech{
public static void main(String []args){
	Scanner in=new Scanner(System.in);
	String n=in.next();
	int c=0;
	for(int i=0;i<n.length()/2;i++)
	{
		for(int j=n.length()/2+1;j<n.length();j++)
		{
			if(n.charAt(i)==n.charAt(j))
			c++;
		}
	}if(c==n.length()/2)
	System.out.println("YES");
	else
	System.out.println("NO");
}
}