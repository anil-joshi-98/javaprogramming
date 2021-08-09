import java.util.Scanner;
class Main4{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int t=in.nextInt();
int k=in.nextInt();
int temp=0;
while(t-->0){
	int x=in.nextInt();
	int y=in.nextInt();
	int v=in.nextInt();
	int value=(y-x)*v;
	if(value>temp)
	temp=value;
}
System.out.println((temp-k));
}
}