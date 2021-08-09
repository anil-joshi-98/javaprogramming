import java.util.*;
import java.io.*;
class Xyz{
	int len,bre;
	public Xyz(int len,int bre){
	this.len=len;
	this.bre=bre;
	}
	int sum(){
	return len+bre;
	}
	int area(){
	return len*bre;
	}
}
class Sum{
	int sum1(Xyz arr[]) {
	for(int i=0;i<arr.length;i++)
	return arr[i].sum();
return 0;	}
	int areaa(Xyz arr[]){
	for(int i=0;i<arr.length;i++)
	return arr[i].area();
	return 0;}
}	
class java1{
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int k=in.nextInt();
	Xyz []o=new Xyz[k];
	for(int i=0;i<k;i++)
	{
		int len=in.nextInt();
		int bre=in.nextInt();
		o[i]=new Xyz(len,bre);
	}
	Sum ob=new Sum();
	for(int i=0;i<k;i++){
		System.out.println(ob.sum1(o));
	}
	for(int i=0;i<k;i++)
	System.out.println(ob.areaa(o));
}
}