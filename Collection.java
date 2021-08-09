class First{
	void display(){
		System.out.println("hello this is first class' display");
	}
}
public class Collection extends First{
	void display(){
		super.display();
		System.out.println("this is an outer class");
	}
	/*
	class Hell{
		void display(){
			super
			System.out.println("hello this is an innner class");
		}
	}*/
	public static void main(String[] args) {
		//Collection.Hell ob=new Collection().new Hell();
		Collection ob=new Collection();
		ob.display();
}
}
