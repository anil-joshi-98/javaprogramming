import java.util.*;
class INput{
	void enter(){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		System.out.println(s);
	}
public static void main(String[] args){
	new INput().enter();
	System.out.println("hello this is main function");
}
}