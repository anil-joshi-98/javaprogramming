import java.io.*;
class File3{
public static void main(String []args)throws IOException{
FileWriter in=new FileWriter("filenow.txt");
BufferedWriter bf=new BufferedWriter(in);
bf.write("filenow is ready");
bf.close();
}
}