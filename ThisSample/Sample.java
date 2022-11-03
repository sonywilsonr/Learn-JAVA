public class Sample {
int a=100,b=200;
Sample(int a,int b){
	 this.a=a;
	 this.b=b;
	 a=this.a;
	 b=this.b;
	 System.out.println(a+" "+b);
	System.out.println(this.a+" "+this.b);
}
}
