import java.util.*;
/*class Super{
	int door,gear;
	Super(int door,int gear){
		this.door=door;
		this.gear=gear;
		System.out.println("this is our first class constructor "+(door+gear));
	}
	void first()
	{
		System.out.println("first class");
	}
}*/
final class first{
	void fir(){
		System.out.println("hello");
	}
}
class Exam1 //extends Super
{
	void first(){
		System.out.println("second class");
		new Exam1().first(2,3);
		//super.first();
	}
	void first(int x,int y){
		System.out.println(x+y);
	}
	/*Exam1(){
		super(2,3);
		System.out.println("this is our main class constructor");
	}*/
	public static void main(String[] args){
	Exam1 ob=new Exam1();
	first ob1=new first();
	ob1.fir();
	ob.first();
}
}