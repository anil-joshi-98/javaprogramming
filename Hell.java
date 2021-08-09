import java.util.*;
class Hell{
	public static void main(String[] args){
		Hello:
		for(int i=0;i<5;i++){
			if(i==2)
			break Hello;
			else
			System.out.println("hello");
		}
	}
}
