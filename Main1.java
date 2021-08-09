class Main1{
	int return1(int x,int y){
		int count=0;
		if(x==0){
			count+=y/2;
			return 0;
		}
		else if(x%2!=0){
			return count+return1(x/2,y*2)+y;
		}
		else{
			count+=2;
			return count+return1(x/2,y*2)-y;
		}
	}
	public static void main(String[] args){
		System.out.println(new Main1().return1(20,1));
	}
}