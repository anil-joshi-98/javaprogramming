import java.io.*;
import java.util.Scanner;
public class Second{
public static void main(String []args) throws IOException{
Scanner in=new Scanner(System.in);
String i=in.nextLine();
FileOutputStream of=new FileOutputStream("./file1.txt");
char arr[]=i.toCharArray();
for(int x=0;x<i.length();x++){
of.write(arr[x]);
}
System.out.println("saved successfully");
of.close();
}
}