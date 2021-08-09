import java.lang.Exception;
class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}
class Linkedlist{
	public static void main(String[] args){
		int x=1;
		int y=0;
		try
		{
		if(x>y)
			throw new MyException("error found");
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("program finished");
		}
	}
}