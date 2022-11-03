import java.util.Scanner;

public class IfSample {
public static void main(String arg[]) {
	System.out.print("enger a number=");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int i,sum=0;
	for(i=0;i<=num;i++) {
		sum=sum+i;
	}
	System.out.println("sum= "+sum);
}
}
