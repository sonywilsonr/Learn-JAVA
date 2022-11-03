package functionsamplee;

import java.util.Scanner;

public class FunctionSample {
public static void main(String arg[]) {
System.out.println("enter two numbers");
Scanner s=new Scanner(System.in);
int num1=s.nextInt();
int num2=s.nextInt();
int result=sum(num1,num2);
System.out.println("sum="+result);
}

static int sum(int a,int b) {
	int s=a+b;
	return s;
}
}
