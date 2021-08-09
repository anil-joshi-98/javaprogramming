import java.io.*;
public class Third{
public static void main(String []args) throws IOException{
int i;
FileInputStream in=new FileInputStream("./file1.txt");
do{
	i=in.read();
	if(i!=-1)
	System.out.print((char)i);
}while(i!=-1);
in.close();
}
}