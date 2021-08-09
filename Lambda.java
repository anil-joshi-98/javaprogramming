class Lambda{
public static void main(String[] args){
	/*Runnable n=()->{
		for(int i=0;i<5;i++){
			System.out.println("process 1");
			try{Thread.sleep(2000);}catch(Exception e){}
		}
	}};
	Runnable n1=()->{
		for(int i=0;i<5;i++){
		System.out.println("process 2");
		try{Thread.sleep(2000);}catch(Exception e){}
		}
	}};
	Thread t1=new Thread(n1);
	Thread t2=new Thread(n);
	t1.start();
	t2.start();*/
	
	Thread t1=new Thread(()->{
		for(int i=0;i<5;i++){
			System.out.println("process 1");
			try{Thread.sleep(2000);}catch(Exception e){}
		}
	});
	Thread t2=new Thread(()->{
		for(int i=0;i<5;i++){
		System.out.println("process 2");
		try{Thread.sleep(2000);}catch(Exception e){}
		}
	});
	t1.start();
	t2.start();
}
}