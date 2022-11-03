public class B extends A{
	int a;
	B(){
		System.out.println("its B constructor");
	}
	B(int a){
		super(10);
		System.out.println("its argument constroctor of B");
	}
	void display() {
		
		System.out.println("its B");
		a=20;
		super.a=30;
		int c=a+super.a;
		System.out.println(c);
	}
	void basedisplay() {
		super.display();
	}
public static void main(String[] args) {
	 B b=new B(10);
	 /*b.display();
	 b.basedisplay();*/
}
}
