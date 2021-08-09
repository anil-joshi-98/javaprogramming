import java.util.*;
import java.lang.*;
class Codechef1{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
			int count=0;
			int x=in.nextInt();
			while(x>0){
				anil:
				for(int i=11;i>=0;i--){
					if(x>=(int)Math.pow(2,i)){
						count++;
						x=x-(int)Math.pow(2,i);
						break anil;
					}
				}
			}
			System.out.println(count);
		}
	}
}