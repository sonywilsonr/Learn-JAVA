package functionsample;

import java.util.Scanner;

public class FunctionSample {
	public static void main(String a[]) {
		Scanner m=new Scanner(System.in);
		System.out.println("enter two numbers=");
		int c=m.nextInt();
		int b=m.nextInt();
		int s=sum(b,c);
		
		System.out.println("result="+s);
	}
static int sum(int num1,int num2) {
	int result=num1+num2;
	return result;
}
}
