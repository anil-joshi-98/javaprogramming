import java.io.*;
class Public{
public static void main(String []args)throws IOException{
int ch;
FileReader in=new FileReader("filenow.txt");
BufferedReader bf=new BufferedReader(in);
while((ch=bf.read())!=-1){
System.out.print((char)ch);
}bf.close();
}
}