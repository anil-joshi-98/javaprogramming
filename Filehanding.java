//package fl;
import java.io.*;
class Filehandling {
	public static void main(String[] args) {
		try {
			FileWriter in=new FileWriter("file.txt");
			BufferedWriter bf=new BufferedWriter(in);
			BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
			String t=s.readLine();
			bf.write(t);
			bf.close();
		}
		catch(IOException e) {
			System.out.println("error in this program");
		}
	}
}