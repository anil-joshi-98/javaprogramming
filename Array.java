import java.util.Arrays;
class Array{
public static void main(String[] args)
{
	int arr[]=new int[4];
	arr[0]=2322;
	arr[1]=333;
	arr[2]=32;
	arr[3]=6545;
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
}
}