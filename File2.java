import java.io.*;
public class File2{
public static void main(String []args)throws IOException{
FileReader in=new FileReader("file.txt");
BufferedReader bf=new BufferedReader(in);
int i=0;
do{  
i=bf.read();
if(i!=-1)
System.out.print((char)i);
}while(i!=-1);
bf.close();
}
}