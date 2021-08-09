class Rec{
public static void main(String[] args){
	String s="hello";
	char arr[]=s.toCharArray();
	for(int i=0;i<arr.length-1;i++)
	{
		char a=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=a;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}