package hello;

class A{
	static int a;
	A(){
		a=a+1;
		System.out.println(a);
	}
}
public class Example {
	public static void main(String[] args) {
		A obj = new A();
		A obj1= new A();
		

	}

}
