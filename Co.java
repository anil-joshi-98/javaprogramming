import java.util.*;
class Co{
public static void main(String []args){
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
int z=a>b?a:b;
int hcf=0;
for(int i=2;i<=z;i++){
	if(i%a==0 && i%b==0){
	hcf=z;break;}
	else 
	hcf=1;
}System.out.println(hcf);
}
}