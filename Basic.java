class Basic{
public static void main(String[] args){
	Runnable n=new p2(){
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("process 1");
			try{Thread.sleep(2000);}catch(Exception e){}
		}
	}};
	Runnable n1=new p1(){
	public void run(){
		for(int i=0;i<5;i++){
		System.out.println("process 2");
		try{Thread.sleep(2000);}catch(Exception e){}
		}
	}};
	Thread t1=new Thread(n1);
	Thread t2=new Thread(n);
	t1.start();
	t2.start();
}
}