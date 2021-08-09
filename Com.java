import java.util.*;
class Com{
	int check(int c){
		int d=1,k=1;
		while(d!=0){
			d=0;
		for(int i=2;i<=c/2;i++){
			if((c+k)%i==0)
			d++;
		}
		if(d>0)
		k++;
		}
		return k;
	}
public static void main(String []args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-->0){
	int c=in.nextInt();
	int d=in.nextInt();
	c=c+d;
	int p=0;
	p=new Com().check(c);
	System.out.println(p);
	
}
}
}