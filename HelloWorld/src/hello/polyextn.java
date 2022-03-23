package hello;

class Poly{
	void display() {
		System.out.println("no arg");
	}
	void display(int a) {
		System.out.println("no arg1");
	}
	void display(int a, int b) {
		System.out.println("two arg of int");
	}
	void display(float a, float b) {
		System.out.println("two arg of float");
	}
}

public class polyextn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly p = new Poly();
		p.display(2,3);	

	}

}
