package java_sample;

public class Sample {
public static void main(String arg[]) {
	int num1=100;
	int num2=200;
	int num3=150;
	int num4=250;
	
	Sum s=new Sum();
	Sum s1=new Sum();
	 s.calculatesum(num1,num2);
	 s.display();
	 
	 s1.calculatesum(num3, num4);
	 s1.display();
	 s.display();
}
}
