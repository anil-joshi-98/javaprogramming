import java.io.*;
import java.util.*;

public class Hacker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> ob=new ArrayList<>();
        int t=in.nextInt();
        while(t-->0){
            ob.add(in.nextInt());
        }
        int q=in.nextInt();
        while(q-->0){
            String a=in.next();
            if(a.equals("Insert"))
			{
				int c=in.nextInt();
				int d=in.nextInt();
				ob.add(c,d);
			}
			else{
				int e=in.nextInt();
				ob.remove(e);
			}
        }
		for(int x:ob){
			System.out.print(x+" ");
		}
    }
}