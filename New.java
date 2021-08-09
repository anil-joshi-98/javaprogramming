import java.io.File;
import java.io.IOException;
class New{
	public static void main(String []args)throws IOException{
	File in=new File("file1.txt");
	in.createNewFile();
	System.out.println(in.exists());
	System.out.println(in.canRead());
	System.out.println(in.canWrite());
	System.out.println(in.getAbsolutePath());
	System.out.println(in.list());
	System.out.println(in.getName());
	}
}
